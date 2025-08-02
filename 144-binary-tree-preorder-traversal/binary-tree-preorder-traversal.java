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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        preorder(list,root);
        return list;
    }
    public static void preorder(ArrayList<Integer>list,TreeNode node){
        //base
        if(node==null){
            return;
        }
        //work/recursive call
        list.add(node.val);
        preorder(list,node.left);
        preorder(list,node.right);
    }
}