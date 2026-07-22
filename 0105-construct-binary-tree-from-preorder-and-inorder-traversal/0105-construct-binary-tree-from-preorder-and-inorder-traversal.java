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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return Build(0,n-1,0,n-1,preorder,inorder);

        
    }
    public TreeNode Build(int preLo,int preHi,int inLo,int inHi,int[] preorder,int[] inorder){
        if(preLo>preHi) return null;
        int val=preorder[preLo];
        TreeNode root=new TreeNode(val);
        int r=0;
        for(int i=inLo;i<=inHi;i++){
            if(inorder[i]==val){
                r=i;
                break;

            }
        }
        int cnt=r-inLo;
        root.left=Build(preLo+1,preLo+cnt,inLo,r-1,preorder,inorder);
        root.right=Build(preLo+1+cnt,preHi,r+1,inHi,preorder,inorder);
        return root;
    }
}