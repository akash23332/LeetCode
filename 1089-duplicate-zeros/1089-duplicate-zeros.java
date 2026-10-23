class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        int i=0;
        int j=0;
        while(j<res.length){
            if(res[i]!=0){
                arr[j]=res[i];
                i++;
                j++;
            }
            else{
                arr[j]=0;
                j++;
                if(j<arr.length){
                arr[j]=0;
                j++;

                }
                
                i++;
                
            }
        }
        
        
    }
}