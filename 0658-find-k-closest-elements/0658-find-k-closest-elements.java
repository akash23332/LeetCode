
class Triplet implements Comparable<Triplet>{
    int ele;
    int dist;
    Triplet(int ele,int dist){
        this.ele=ele;
        this.dist=dist;
    }
    @Override
    public int compareTo(Triplet t){
        if(this.dist==t.dist){
            return Integer.compare(this.ele,t.ele);
        }
        return Integer.compare(this.dist,t.dist);
    }
} 

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            int y=arr[i];
            int dist=Math.abs(y-x);
            pq.add(new Triplet(y,dist));
            if(pq.size()>k){
                pq.remove();
                
            }
        }
        int[] ans =new int[k];
        for(int i=0;i<k;i++){
            Triplet top=pq.remove();
            ans[i]=top.ele;
        }
         Arrays.sort(ans); // Answer ascending order me chahiye

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            res.add(ans[i]);
        }

        return res;
        
    }

}