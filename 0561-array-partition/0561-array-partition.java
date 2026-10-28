class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int sum=0;
        while(j<nums.length){
            sum+=Math.min(nums[i],nums[j]);
            i+=2;
            j+=2;

        }
        return sum;
        
    }
}