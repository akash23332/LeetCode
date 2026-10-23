class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            int ele=nums[i];
            int count=0;
            while(ele!=0){
                ele=ele/10;
                count++;
            }
            if(count%2==0){
                c++;
            }

        }
        return c;
    }
}