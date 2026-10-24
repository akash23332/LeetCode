class Solution {
    
    
    public int[] replaceElements(int[] arr) {
        int res[] = new int[arr.length];
      
        int max=-1;
       for(int j=arr.length-1;j>=0;j--){
        res[j]=max;
        if(arr[j]>max){
            max=arr[j];
        }
        
       
        
        }
       return res;
        
    }
}