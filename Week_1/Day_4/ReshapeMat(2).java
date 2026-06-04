// Problem: Reshape the Matrix
// Description: Convert a matrix into dimensions r x c while preserving element order.
// Approach: Map each element using a single index and then..place it into the new matrix.
// Time Complexity: O(m*n)
//Space com: O(r*c)

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if(m * n != r * c) return mat;

        int[][] ans = new int[r][c];

        for(int i = 0; i < m * n; i++){
            ans[i / c][i % c] = mat[i / n][i % n];
        }

        return ans;
    }
}
