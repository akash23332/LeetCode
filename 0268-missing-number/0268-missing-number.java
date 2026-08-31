class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int idx=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            
        }
        for(int j=0;j<=n;j++){
            if(!set.contains(j)){
                idx=j;

            }
            
        
        }
        return idx;
    }
}