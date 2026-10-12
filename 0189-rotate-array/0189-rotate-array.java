class Solution {
    public void rot(int [] nums,int k,int left,int right){
       
         while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }

    }
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        if(k%n==0) return ;
        k=k%n;
        rot(nums,k,0,n-1);
       rot(nums,k,0,k-1);
       rot(nums,k,k,n-1);
        
        

        
    }
}