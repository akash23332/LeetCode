class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> curr=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
           
        }
        com(n,k,arr,0);
        return ans;
    }
    public void com(int n,int k,int[] arr,int start){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;

        }
        for(int i=start;i<arr.length;i++){
            curr.add(arr[i]);
            com(n,k,arr,i+1);
            curr.remove(curr.size()-1);
            
        
        }
    }

}