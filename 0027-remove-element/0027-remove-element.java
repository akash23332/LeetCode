class Solution {
    public int removeElement(int[] nums, int val) {
        
        int[] res=new int[nums.length];
        int k=0;
        for(int num:nums){
            if(num==val){
                continue;
            }
            
           else{
                
            res[k]=num;
            k++;
            }
        }
        
        for(int i=0;i<res.length;i++){
            nums[i]=res[i];
        }
        return k;
        
    }
}