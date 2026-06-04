// Problem: Matrix Diagonal Sum
// Description: Find the sum of primary and secondary diagonal elements of a square matrix.
// Approach: Traverse both diagonals and subtract middle element once if counted twice.
// Time Complexity: O(n)
//Space com: O(1)

class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int sum = 0;

        int i = 0;
        for(int j = i; j < m; j++){
            sum += mat[i][j];
            i++;
        }

        int k = n - 1;
        for(int j = 0; j < m; j++){
            sum += mat[k][j];
            k--;
        }

        if(n % 2 == 1) sum -= mat[n/2][n/2];

        return sum;
    }
}
