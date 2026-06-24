// Problem: Check whether a binary tree is a valid BST.
// Approach: first , we perform inorder traversal and then verify values are strictly increasing.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i + 1)){
                return false;
            }
        }

        return true;
    }

    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
