// Problem:  Design a stack that supports retrieving minimum element.
// Approach: we maintain an extra stack to track minimum values.
// Time Complexity: O(1) per operation
// Space Complexity: O(n)

class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int value) {
        st.push(value);

        if (min.isEmpty() || value <= min.peek())
            min.push(value);
    }

    public void pop() {
        if (st.peek().equals(min.peek()))
            min.pop();

        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
