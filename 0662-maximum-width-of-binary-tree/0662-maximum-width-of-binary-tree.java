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

    class pair{
        TreeNode node;
        long idx;
        pair(TreeNode node, long idx) {
            this.node = node;
            this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
       return width(root);
        
    }
    public int width(TreeNode root){
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        int maxWidth=0;
        while(q.size()>0){
            long lidx=q.peek().idx;
            long ridx=lidx;
            int n=q.size();
            for(int i=0;i<n;i++){
                pair front=q.remove();
                TreeNode node=front.node;
                long idx=front.idx;
                ridx=idx;

                if(node.left!=null) q.add(new pair(node.left,2*idx+1));
                if(node.right!=null) q.add(new pair(node.right,2*idx+2));
                }
                int width=(int) (ridx-lidx+1);
    if(width>maxWidth){
        maxWidth=width;
    }
                
        }
    
    return maxWidth;
    }
}