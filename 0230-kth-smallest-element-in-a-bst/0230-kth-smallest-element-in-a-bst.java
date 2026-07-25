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
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {

    count=0;
    ans=0;
    k(root,k);
    return ans;

        
    }
    public void k(TreeNode root,int k){
        if(root==null) return ;
        
        k(root.left,k);
        count++;
        if(k==count){
            ans= root.val;
            return ;
        }
        
        k(root.right,k);

    }
}