class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        int i=0;
        int j=arr.length-1;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        StringBuilder a=new StringBuilder();
        for(int k=0;k<arr.length;k++){
            a.append(arr[k]);
            if(k!=arr.length-1){
                a.append(" ");
            }
        }
        return new String(a);
        
    }
}