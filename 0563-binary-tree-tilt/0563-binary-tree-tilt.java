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
  
        int tilt=0;

    public int helper(TreeNode root){
        
        if(root==null) return 0;
        int lst=helper(root.left);
        int rst=helper(root.right);
        tilt+=Math.abs(lst-rst);
        return root.val+lst+rst;

    }
    public int findTilt(TreeNode root) {

        helper(root);
        return tilt;

    }
}