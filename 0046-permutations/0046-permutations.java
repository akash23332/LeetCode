class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        int n=nums.length;
        boolean[] check=new boolean[n];
        per(nums,ans,a,check);
        return ans;

        
    }
    public void  per(int[] nums,List<List<Integer>> ans,List<Integer> a,boolean[] check){
        if(a.size()==nums.length){
            ArrayList<Integer> copy=new ArrayList<>(a);
            ans.add(copy);
        }
        for(int i=0;i<nums.length;i++){
            if(!check[i]){
                a.add(nums[i]);
                check[i]=true;
                per(nums,ans,a,check);
                a.remove(a.size()-1);
                check[i]=false;
            }
        }
    }

}