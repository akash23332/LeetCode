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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        if (root == null)
    return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            List<Integer> avg=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode front=q.remove();
                avg.add(front.val);
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            long sum=0;
        
            for(int i=0;i<avg.size();i++){
                sum+=avg.get(i);
            }
            
            double a = (double) sum / avg.size();

            ans.add(a);
            
        }
        
        return ans; 
    }
}