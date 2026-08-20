class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> curr=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
       
        add(nums,0);
        return ans;

        
    }
    public void add(int[] nums,int idx){
        int n=nums.length;
        if(n==idx){
           ans.add(new ArrayList<>(curr));
           return;
        }
    
        curr.add(nums[idx]);
        add(nums,idx+1);
        curr.remove(curr.size()-1);
        add(nums,idx+1);
    

        
    }
}