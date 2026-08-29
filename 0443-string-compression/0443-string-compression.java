class Solution {
    public int compress(char[] arr) {
        int i=0;
        int j=1;
      
        StringBuilder s=new StringBuilder();

        while(i<arr.length){
            
            
            while(j<arr.length && arr[i]==arr[j]){
                j++;
                
            }
            int count=j-i;
           
            
                if(count>1){
                    s.append(arr[i]);
                    s.append(count);
                    count=1;
                }
                else{
                    s.append(arr[i]);
                    
                    

                }

            i=j;
            j=i+1;
            }
            
        
        
        for(int k=0;k<s.length();k++){
            arr[k]=s.charAt(k);
        }
        return s.length();
        
    }
}