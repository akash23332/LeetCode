class Solution {
    public int singleNumber(int[] nums) {
        int n=nums[0];
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-2){
            if(nums[i+1]!=nums[i]){
                return nums[i];
                
            }else if(nums[i+1]==nums[i]){
                i+=2;
            }
        }
        return nums[nums.length-1];
        
    }
}