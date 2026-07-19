class Solution {
    boolean flag=false;
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        flag=false;
        po4(n,0);
        return flag;

        
    }
    public void po4(int n,int power){
        if(Math.pow(4,power)==n){
            flag=true;
            return;
        } 
         if(Math.pow(4,power)>n){
        
            return;
        } 
        po4(n,power+1);
    }
}