class Solution {
    boolean flag=false;
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        po2(n,0);
        return flag;
        
    }
    public void po2(int n,int power){
        if(Math.pow(2,power)==n){flag=true;
        return;}
            if (Math.pow(2, power) > n) {
            return;
        }
        po2(n,power+1);

    }


}