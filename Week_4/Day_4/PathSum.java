// Problem: Check if a root-to-leaf path equals the target sum.
// Approach: recursively subtract node values from target until reaching a leaf.
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;

        if (root.left == null && root.right == null)
            return targetSum == root.val;

        int remaining = targetSum - root.val;

        if (hasPathSum(root.left, remaining)) return true;
        if (hasPathSum(root.right, remaining)) return true;

        return false;
    }
}
