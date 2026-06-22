// Problem: Check if two binary trees are identical.
// Approach: first we Compare current nodes and recursively check subtrees.
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
