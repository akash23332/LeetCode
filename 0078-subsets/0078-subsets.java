class Solution {


    public void subsets(List<Integer> emp,int[] nums,int idx,List<List<Integer>> ans){
       
       
        
        if(idx==nums.length){
            ans.add(new ArrayList<>(emp));
            return;
        }
        
        emp.add(nums[idx]);
        subsets(emp, nums, idx + 1, ans);
        emp.remove(emp.size() - 1);
        subsets(emp,nums,idx+1,ans);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
      
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer> emp = new ArrayList<>();
        
        subsets(emp, nums, 0, ans);

        return ans;

    }
}