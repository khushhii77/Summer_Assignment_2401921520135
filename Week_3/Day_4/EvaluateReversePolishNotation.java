// Problem: Evaluate an arithmetic expression using a stack.
// Approach:first, Push numbers and then apply operators on top elements.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens){

            if(s.equals("+")){
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            }

            else if(s.equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            }

            else if(s.equals("*")){
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            }

            else if(s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }

            else{
                st.push(Integer.parseInt(s));
            }
        }

        return st.peek();
    }
}
