class Solution {
    public static int GCD(int a,int b){
        if(a==0) return b;
       return GCD(b%a,a);

    }

    

    
    public int findGCD(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }

        int n=GCD(max,min);
        return n;
    }
}