// Problem: Count requests within the last 3000 milliseconds.
// Approach: Use a queue and remove outdated requests.
// Time Complexity: O(n)
// Space Complexity: O(n)

class RecentCounter {
    Queue<Integer> qu = new LinkedList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        qu.add(t);

        while (qu.peek() < t - 3000)
            qu.poll();

        return qu.size();
    }
}
