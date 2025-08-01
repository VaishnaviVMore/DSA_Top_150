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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        inorder(list,root);
        return list;
    }
    public static void inorder(ArrayList<Integer>list,TreeNode node){
        if(node==null){
            return; 
        }
            inorder(list,node.left);
            list.add(node.val);
            inorder(list,node.right);
    }
    //return list;
}