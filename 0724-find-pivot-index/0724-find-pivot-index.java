class Solution {
    public int pivotIndex(int[] nums) {
       int i=0;
       int j=0;
        int suml=0;
        int sumr=0;
        while(i<nums.length){
            sumr+=nums[i];
            i++;


    }
    while(j<nums.length){
        sumr-=nums[j];
        if(sumr==suml) return j;
        suml+=nums[j];
        j++;
    }
    return -1;
       

        
    }
}