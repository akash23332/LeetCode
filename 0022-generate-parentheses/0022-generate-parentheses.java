class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        para( n ,0,0,"");
        return ans;
    }
    public void para(int n ,int close ,int open,String s){
        if(close==n){
            ans.add(s);
            return;
        }

        if(open<n){
            para(n,close,open+1,s+"(");
        }
        if(close<open){
            para(n,close+1,open,s+")");
        }

    }
}