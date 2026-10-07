class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int ans=0;
        for(int j=0;j<nums.length;j++){
            int n=nums[j];
            map.put(n,map.getOrDefault(n,0)+1);
            while(map.getOrDefault(0,0)>k){

                int x=nums[i];
                map.put(x,map.get(x)-1);
                if(map.get(x)==0){
                    map.remove(x);
                }
                i++;
            }
            ans=Math.max(ans,j-i+1);
            

        }
        return ans;
    }
}