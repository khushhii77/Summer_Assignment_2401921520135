// Problem: Find the lowest common ancestor of two nodes in a BST.
// Approach: move left or right based on node values until split point is found.
// Time Complexity: O(h)
// Space Complexity: O(1)

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      
        while(root != null){

            if(p.val > root.val && q.val > root.val){
                root = root.right;
            }
            else if(p.val < root.val && q.val < root.val){
                root = root.left;
            }
            else{
                return root;
            }
        }

        return null;
    }
}
