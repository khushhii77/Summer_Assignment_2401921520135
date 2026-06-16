// Problem: Merge two sorted linked lists into one sorted list.
// Approach: here we will use a dummy node and compare nodes from both lists.
// Time Complexity: O(n + m)
// Space Complexity: O(1)

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        while (temp1 != null && temp2 != null) {

            if (temp1.val <= temp2.val) {
                ans.next = temp1;
                temp1 = temp1.next;
            } else {
                ans.next = temp2;
                temp2 = temp2.next;
            }

            ans = ans.next;
        }

        if (temp1 != null) ans.next = temp1;
        if (temp2 != null) ans.next = temp2;

        return dummy.next;
    }
}
