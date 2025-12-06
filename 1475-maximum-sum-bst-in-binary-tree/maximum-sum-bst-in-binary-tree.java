class Solution {
    int result = 0;   // GLOBAL variable

    public int maxSumBST(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else{
             helper(root);
        return result;
        }
    }

    // returns {minValue, maxValue, sum}
    public int[] helper(TreeNode node) {
        if (node == null) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }

        int[] left = helper(node.left);
        int[] right = helper(node.right);

        // if not BST
        if (left[1] >= node.val || right[0] <= node.val) {
            return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
        }

        int sum = left[2] + node.val + right[2];
        result = Math.max(result, sum);

        return new int[]{
            Math.min(node.val, left[0]),
            Math.max(node.val, right[1]),
            sum
        };
    }
}
