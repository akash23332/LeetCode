class Solution {
    public int[] replaceElements(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
       int max=-1;
       for(int i=arr.length-1;i>=0;i--){
           ans.add(0,max);
           max=Math.max(arr[i],max);
       }
       int[] a=new int[ans.size()];
       for(int i=0;i<ans.size();i++){
        a[i]=ans.get(i);
       }
        return a;
        
    }
}