class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int count=Integer.MAX_VALUE;
       
         
        while(j<nums.length){
            sum+=nums[j];
            

           while(sum>=target){
            count=Math.min(count,j-i+1);
                sum=sum-nums[i];
                i++;

           }
                
                j++;
            }
           
        

            
         return count == Integer.MAX_VALUE ? 0 : count;
            
            }
         
        
    }
