class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        
        for(int i=digits.length-1;i>=0;i--){
                int n=digits[i]+carry;
                digits[i]=n%10;
                carry=n/10;

                if(carry==0) break;
            
            

        }
        if(carry==1){
            int[] ans=new int[digits.length+1];
            ans[0]=1;
            return ans;

        }
        return digits;
        
    }
}