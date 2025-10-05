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
    public static boolean isPresent(TreeNode node, TreeNode subRoot){
        if(node==null && subRoot==null){
            return true;
        }
        if(node==null || subRoot==null){
            return false;
        }
        if(node.val!=subRoot.val){
            return false;
        }
        if(!isPresent(node.left,subRoot.left)){
            return false;
        }
        if(!isPresent(node.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(isPresent(root,subRoot)) return true;
        boolean lefttree=isSubtree(root.left,subRoot);
        boolean righttree=isSubtree(root.right,subRoot);
        return lefttree||righttree;
    }
}