//Problem: Reshape the Matrix
// Description: Convert a matrix into dimensions r x c while preserving element order.
// Approach: Here,we traverse the original matrix and fill the new matrix row by row using row and column pointers.
             //Nested loop + row/col tracking
// Time Complexity: O(m*n)
//Space Complexity: O(r*c)


class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) return mat;

        int[][] ans = new int[r][c];

        int row = 0;
        int col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                ans[row][col] = mat[i][j];
                col++;

                if (col == c) {
                    col = 0;
                    row++;
                }
              
            }
        }

        return ans;
    }
}
