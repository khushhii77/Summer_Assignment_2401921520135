// Problem: Find how many days to wait for a warmer temperature.
// Approach: we use a stack to track unresolved temperature indices.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){

            while(!st.isEmpty() &&
                    temperatures[i] > temperatures[st.peek()]){

                int idx = st.pop();
                ans[idx] = i - idx;
            }

            st.push(i);
        }

        return ans;
    }
}
