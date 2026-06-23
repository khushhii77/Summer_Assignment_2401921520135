// Problem: Return zigzag level order traversal of a binary tree.
// Approach: at first, we Use BFS and then alternate insertion direction at each level.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean LR = true;

        while (!q.isEmpty()) {

            int size = q.size();
            Integer[] level = new Integer[size];

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                int index = LR ? i : size - 1 - i;
                level[index] = node.val;

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            LR = !LR;
            result.add(Arrays.asList(level));
        }

        return result;
    }
}
