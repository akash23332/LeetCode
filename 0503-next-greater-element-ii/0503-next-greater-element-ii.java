class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums.length]; 
        int n=nums.length;
        Arrays.fill(ans,-1);
        for(int i=2*n-1 ;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx]){
                st.pop();
            }
            if(i<n && !st.isEmpty() ){
                ans[idx]=st.peek();
            }
            st.push(nums[idx]);
        }
        return ans;       
    }
}