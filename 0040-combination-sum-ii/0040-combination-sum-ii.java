class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> curr=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        comb(candidates,target,0);
        return ans;
        
    }
    public void comb(int[] candidates , int target,int start){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        
        for(int i=start;i<candidates.length;i++){
               if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            curr.add(candidates[i]);
            comb(candidates,target-candidates[i],i+1);
            curr.remove(curr.size()-1);
        }

    }
}