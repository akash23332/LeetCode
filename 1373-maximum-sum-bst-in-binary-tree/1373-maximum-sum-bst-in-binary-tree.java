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
 class Quad{
    Long sum;
    boolean isBst;
    long max;
    long min;
    Quad(long sum,boolean isBst,long max,long min){
        this.sum=sum;
       this.isBst=isBst;
       this.max=max;
       this.min=min;
    }
 }
class Solution {
    static long sum;
    public int maxSumBST(TreeNode root) {
        sum=0;
        MaxSum(root);
        return (int) sum;
        
    }
    public Quad MaxSum(TreeNode root){
        if(root==null) return new Quad(0,true, Long.MIN_VALUE,Long.MAX_VALUE);
        Quad lst=MaxSum(root.left);
        Quad rst=MaxSum(root.right);
        long max=Math.max(root.val,Math.max(lst.max,rst.max));
        long min=Math.min(root.val,Math.min(lst.min,rst.min));

        long Sum=root.val+lst.sum+rst.sum;
        boolean isBst=lst.isBst && rst.isBst  && (lst.max<root.val) && (rst.min>root.val);
        if(isBst){
           sum = Math.max(Sum, sum);
            // return new Quad(sum, true, max, min);
        }
        return new Quad(Sum,isBst,max,min);
    }
}