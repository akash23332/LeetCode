class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int incount=0;
        int decount=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1] && decount==0){
                incount++;
            }
            else if(arr[i]<arr[i-1] && incount>0){
                decount++;
            }
            else{
                return false;
            }
        }
        if(incount>0 && decount>0){
            return true;
        }
        return false;


        
    }
}