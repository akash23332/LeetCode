
class Triplet implements Comparable<Triplet>{
    int ele;
    int x;
    int y;
    Triplet(int ele,int x,int y){
        this.ele=ele;
        this.x=x;
        this.y=y;
        
    }
    public int compareTo(Triplet p){
        return Integer.compare(this.ele,p.ele);
    }

}
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans=new int[2];
        ans[0]=Integer.MIN_VALUE;
        ans[1]=Integer.MAX_VALUE;
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            int ele=nums.get(i).get(0);
            pq.add(new Triplet(ele,i,0));
            max=Math.max(max,ele);
        }
        while(pq.size()==nums.size()){
            Triplet top=pq.poll();
            int min=top.ele;
            if((long)max-min<(long)ans[1]-ans[0]){
                ans[0]=min;
                ans[1]=max;
            }
            int x=top.x;
            int y=top.y;
            if(y+1==nums.get(x).size()){
                break;
            }
            int next=nums.get(x).get(y+1);
            pq.add(new Triplet(next, x, y + 1));
            max = Math.max(max, next);
        }
        return ans;
        
    }
    
}