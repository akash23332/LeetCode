class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        for(int j=0;j<nums.length;j++){
                    nums[j]=pq.remove();
                }
        return nums;
        
    }
}