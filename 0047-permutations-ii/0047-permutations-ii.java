class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    List<Integer> a=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] unique=new boolean[nums.length];
        perm(nums,unique);
        return ans;
        
    }
    public void perm(int[] nums,boolean[] unique){
        if(a.size()==nums.length){
            ans.add(new ArrayList<>(a));
        }
        for(int i=0;i<nums.length;i++){
             if (unique[i]) {
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] &&  !unique[i-1]){
                continue;
            }
            a.add(nums[i]);
            unique[i]=true;
            perm(nums,unique);
            a.remove(a.size()-1);
            unique[i]=false;
        }
    }
}