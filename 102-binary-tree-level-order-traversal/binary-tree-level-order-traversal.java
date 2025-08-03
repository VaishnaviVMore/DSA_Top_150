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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>>lmain=new ArrayList<List<Integer>>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return lmain;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer>sub=new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            sub.add(node.val);
            if(node.left !=null) q.offer(node.left);
            if(node.right !=null)q.offer(node.right);
            //sub.add(q.poll());
            }
            lmain.add(sub);
        }
        return lmain;
    }
}