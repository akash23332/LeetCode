class Solution { 
    List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        sub(nums,0);
        return ans;
    }
    public void sub(int[] nums,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        sub(nums,idx+1);
        curr.remove(curr.size()-1);
        sub(nums,idx+1);
    }
}