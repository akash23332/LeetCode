class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> curr=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        comb(candidates, target,0);
        return ans;
        
    }
    public void comb(int[] candidates, int target,int start){
      
       
        if(target==0){
            ans.add(new ArrayList<>(curr));
           
            return;

        }
        if(target<0){
        return;
        }
        for(int i=start;i<candidates.length;i++){
            curr.add(candidates[i]);
            comb(candidates,target-candidates[i],i);
            curr.remove(curr.size()-1);
            
        }
        }
        
}