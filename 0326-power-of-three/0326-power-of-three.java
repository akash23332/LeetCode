class Solution {
    boolean flag=true;
    public boolean isPowerOfThree(int n) {
        
        if(n<=0) return false;
        flag=false;
        po3(n,0);
        return flag;
        
    }
    public void po3(int n,int power){
        if(Math.pow(3,power)==n){
            flag=true;
            return;
        }
        if(Math.pow(3,power)>n){
            return;
        }
        po3(n,power+1);

    }
}