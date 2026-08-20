class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int i=0;
    
        while(i<arr.length){
            int left=i;
            int right=Math.min(i+k-1,arr.length-1);
            while(left<right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
            }
            i=i+2*k;
           
       
        

    }
    return new String(arr);
    }
   
}