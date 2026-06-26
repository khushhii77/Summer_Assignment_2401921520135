// Problem: Construct a binary tree from preorder and inorder traversals.
// Approach: we just use preorder for root and hashmap for inorder positions.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    int p = 0;
    HashMap<Integer, Integer> mp = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            mp.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] pre, int l, int r) {
        if (l > r) return null;

        int val = pre[p++];
        TreeNode root = new TreeNode(val);

        int mid = mp.get(val);

        root.left = build(pre, l, mid - 1);
        root.right = build(pre, mid + 1, r);

        return root;
    }
}
