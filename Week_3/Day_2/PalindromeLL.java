// Problem: Check whether the linked list is a palindrome.
// Approach: 3 steps... 1st we find middle, 2nd we reverse second half, & then compare both halves.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return true;

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode temp = slow;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        // Compare both halves
        while (prev != null) {

            if (head.val != prev.val) return false;

            head = head.next;
            prev = prev.next;
        }

        return true;
    }
}
