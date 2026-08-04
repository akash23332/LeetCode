class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:piles){
            pq.add(num);
        }
        for(int i=0;i<k;i++){
            int a=pq.remove();
            int b=(int) Math.floor(a/2);
            int rem=a-b;
            pq.add(rem);
        }
        long sum=0;
        while(pq.size()>0){
            sum+=pq.remove();

        }
        return (int) sum;

        
    }
}