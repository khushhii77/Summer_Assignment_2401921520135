// Problem: Check if a binary tree is symmetric.
// Approach: compare left and right subtrees recursively as mirror images.
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a.val != b.val) return false;

        return isMirror(a.left, b.right) &&
               isMirror(a.right, b.left);
    }
}
