class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> curr=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
       
        comb(k,n,1);
        return ans;
        
    }
    public void comb(int k,int n,int start){
        if(curr.size()>=k){
            if(n==0){
                ans.add(new ArrayList<>(curr));

            }
            
            return;
        }
        
        for(int i=start;i<10;i++){
            curr.add(i);
            comb(k,n-i,i+1);
            curr.remove(curr.size()-1);
        }

    }
}