// Problem: Find the maximum path sum in a binary tree.
// Approach: here, recursively compute maximum gain from each node and update answer.
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));

        max = Math.max(max, root.val + left + right);

        return root.val + Math.max(left, right);
    }
}
