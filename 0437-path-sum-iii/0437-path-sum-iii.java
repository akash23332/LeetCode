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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        count=0;
        traverse(root,targetSum);
        return count;

        
    }
    public void traverse(TreeNode root,long targetSum){
        if(root==null) return ;
        helper(root,targetSum);
        
        traverse(root.left,targetSum);
        traverse(root.right,targetSum);
        
    }
    public void helper(TreeNode root,long targetSum){
        if(root==null) return ;
        
        if((long) root.val==targetSum){
            count++;
        }
        helper(root.left,targetSum-(long)root.val);
        helper(root.right,targetSum-(long)root.val);
        
        


    }
}