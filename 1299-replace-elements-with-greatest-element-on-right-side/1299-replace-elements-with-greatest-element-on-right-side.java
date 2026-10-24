class Solution {
    
    
    public int[] replaceElements(int[] arr) {
        int res[] = new int[arr.length];
        int k=0;
       
       for(int j=0;j<arr.length;j++){
         int max=-1;
        
        
            
            for(int i=j+1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                
            }
        }
        res[k]=max;
        k++;
        }
        
         return res;
        }
    
        
    }
