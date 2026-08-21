class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> curr=new ArrayList<>(); 
    public List<List<Integer>> combine(int n, int k) {

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;

        }
        
        comb(n,k,0,arr);
        return ans;
    }
    public void comb(int n,int k,int start,int[] arr){
        if(curr.size()>=k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<n;i++){
            curr.add(arr[i]);
            comb(n,k,i+1,arr);
            curr.remove(curr.size()-1);
        }

    }
}