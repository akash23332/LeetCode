class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleD=0;
        int lastidx=arr.length-1;
        for(int i=0;i<=lastidx-possibleD;i++){
            if(arr[i]==0){
                if(i==lastidx-possibleD){
                    arr[lastidx]=0;
                    lastidx-=1;
                    break;
                }
                possibleD++;
            }
        }
        int newLast=lastidx-possibleD;
        for(int i=newLast;i>=0;i--){
            if(arr[i]==0){
                arr[i+possibleD]=0;
                possibleD--;
                arr[i+possibleD]=0;
            }else{
                arr[i+possibleD]=arr[i];
            }
        }
        
    }
}