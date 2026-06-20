// Problem: Find the largest rectangle area in a histogram.
// Approach: Use a monotonic stack to calculate maximum area.
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int max = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
           int curr;
             if (i == n) curr = 0;
             else curr = heights[i];

            while (!st.isEmpty() && curr < heights[st.peek()]) {

                int h = heights[st.pop()];
                int r = i;
                int l;

                if (st.isEmpty()) l = -1;
                else  l = st.peek();
              
                int k = r - l - 1;
                max = Math.max(max, h * k);
            }

            st.push(i);
        }

        return max;
    }
}
