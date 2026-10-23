class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        
        for(int i=0;i<arr.length;i++){
            int j=0;
            while(j<arr.length){
            if(i!=j && arr[j]==2*arr[i]){
                return true;
               
            }
             j++;

        }

        }
        return false;
        
    }
}