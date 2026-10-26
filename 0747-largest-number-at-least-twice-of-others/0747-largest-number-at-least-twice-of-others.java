class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sec=0;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;

            }
            

        }
        for(int i=0;i<nums.length;i++){
           if(nums[i]>sec && nums[i]<max){
                sec=nums[i];
            }


            }
        if(max<sec*2){
            return -1;
        }
        return idx;
    }
}