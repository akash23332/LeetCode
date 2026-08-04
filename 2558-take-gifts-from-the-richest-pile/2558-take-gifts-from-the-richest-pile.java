class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        
        for(int num : gifts){
            pq.add(num);
            
        }
        for(int i=0;i<k;i++){
            int a=(int) Math.floor(Math.sqrt(pq.remove()));
            pq.add(a);
        }
        long sum=0;
        while(pq.size()>0){
            sum+=pq.remove();
        }
        return sum;
        
       
        
    }
}