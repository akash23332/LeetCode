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
        int dist;
        pair(TreeNode node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }
   
    public int amountOfTime(TreeNode root, int start) {
        
        HashMap<TreeNode,TreeNode> parent=new HashMap<>();
        TreeNode Target=  dfs(root,start,parent);
      
        Queue <pair> q=new LinkedList<>();
        q.add(new pair(Target,0));
        HashSet<TreeNode> burned=new HashSet<>();
        burned.add(Target);
        int time=0;
        while(q.size()>0){
            pair front=q.remove();
            int dist=front.dist;
            TreeNode Node=front.node;
            time=Math.max(time,dist);
            if(Node.left!=null && !burned.contains(Node.left)){
                q.add(new pair(Node.left,dist+1));
                burned.add(Node.left);


            }
             if(Node.right!=null && !burned.contains(Node.right)){
                q.add(new pair(Node.right,dist+1));
                burned.add(Node.right);


            }
            if(parent.containsKey(Node) && !burned.contains(parent.get(Node))){
                q.add(new pair(parent.get(Node),dist+1));
                burned.add(parent.get(Node));
            }
           
        }
         return time;
    }
    public TreeNode dfs(TreeNode root,int start,HashMap<TreeNode,TreeNode> parent){
     

    if (root == null) return null;

    if (root.left != null) parent.put(root.left, root);
    if (root.right != null) parent.put(root.right, root);

    if (root.val == start) return root;

    TreeNode leftResult = dfs(root.left, start, parent);

    if (leftResult != null) return leftResult;

    return dfs(root.right, start, parent);

    }
}