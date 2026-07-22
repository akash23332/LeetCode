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
    public void helper(TreeNode root, ArrayList<Integer> a,ArrayList<ArrayList<Integer>> ans){
       

   
    if(root==null) return;
    a.add(root.val);
    if(root.left==null && root.right==null){
         ans.add(new ArrayList<>(a));
    }else{
        helper(root.left,a,ans);
        helper(root.right,a,ans);
    }
    a.remove(a.size()-1);
    }
    public int sumNumbers(TreeNode root) {
         ArrayList<Integer> a=new ArrayList<>();
          ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
          helper(root,a,ans);

          int total=0;
       for(int i=0;i<ans.size();i++){

        int num=0;
        for(int j=0;j<ans.get(i).size();j++){
             num = num * 10 + ans.get(i).get(j);
        }
           total += num;
       }
       return total;

    }
}