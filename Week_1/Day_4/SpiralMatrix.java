// Problem: Spiral Matrix
// Description: Return all matrix elements in spiral order.
// Approach: we Use four boundaries (top, bottom, left, right) and traverse layer by layer.
// Time Complexity: O(m*n)
// Space: O(1) extra  (excluding output list)

import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while(top <= bottom && left <= right){

            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){

                for(int i = right; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){

                for(int i = bottom; i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}
