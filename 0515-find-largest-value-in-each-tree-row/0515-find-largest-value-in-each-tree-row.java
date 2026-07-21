/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void helper(TreeNode root,List<Integer> ans,int levels){
        if(root==null) return;
        if(levels>=ans.size()){
            ans.add(root.val);
        }else{
            int a=ans.get(levels);
            if(a<root.val){
                ans.set(levels,root.val);
            }
        }

        helper(root.left,ans,levels+1);
        helper(root.right,ans,levels+1);


    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans,0);
        return ans;
    }
}