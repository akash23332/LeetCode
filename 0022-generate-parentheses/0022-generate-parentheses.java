class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        para(n,"",0,0);
        return ans;
    }
    public void para(int n,String curr,int left,int right){
        if(curr.length()==2*n){
            ans.add(curr);
            return;

        }
        if(left<n){
            para(n,curr+"(",left+1,right);
        }
        if(left>right){
            para(n,curr+")",left,right+1);
        }
    }
}