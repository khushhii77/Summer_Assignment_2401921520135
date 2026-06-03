// Problem: Container With Most Water
// Description: We find the maximum amount of water that can be stored between two lines.
// Approach: Use two pointers and move the smaller height inward.
// Time Complexity: O(n)

class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int h = height.length - 1;
        int max = -1;

        while(l < h){
            int a = Math.min(height[l], height[h]) * (h - l);

            if(a > max)
                max = a;

            if(height[l] < height[h]) l++;
            else h--;
   
        }

        return max;
    }
}
