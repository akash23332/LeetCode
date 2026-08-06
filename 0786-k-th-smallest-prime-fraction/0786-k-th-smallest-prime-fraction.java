class Triplet implements Comparable<Triplet>{
    int x;
    int y;
    double frac;
    Triplet(int x,int y,double frac){
        this.x=x;
        this.y=y;
        this.frac=frac;
    }
    @Override
    public int compareTo(Triplet t){
        return Double.compare(this.frac,t.frac);
    }
}
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int x=arr[i];
                int y=arr[j];
                double frac=(double)x/y;
                pq.add(new Triplet(x,y,frac));
                if(pq.size()>k){
                pq.remove();
            }

            }
            
            
        }
        int[] ans=new int[2];
        Triplet t=pq.remove();
        ans[0]=t.x;
        ans[1]=t.y;

        return ans;
    }
}