// Problem: Invert a binary tree.
// Approach: Swap left and right child recursively.
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.right);
        invertTree(root.left);

        return root;
    }
}
