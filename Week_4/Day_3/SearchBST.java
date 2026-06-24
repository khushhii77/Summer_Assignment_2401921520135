// Problem: Search for a value in a Binary Search Tree.
// Approach: compare current node value with target and move left or right.
// Time Complexity: O(h)
// Space Complexity: O(h)

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;

        if(root.val == val) return root;
        else if(root.val > val) return searchBST(root.left, val);

        else return searchBST(root.right, val);
    }
}
