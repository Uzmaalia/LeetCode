/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode findNthNode(ListNode temp, int k) {
        int cnt = 1;
        while (temp != null && cnt < k) {
            temp = temp.next;
            cnt++;
        }
        return temp; 
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        tail.next = head;

        k = k % len;
        if (k == 0) {
            tail.next = null;
            return head;
        }

        ListNode newLastNode = findNthNode(head, len - k);
        if (newLastNode == null) {
            tail.next = null;
            return head;
        }

        ListNode newHead = newLastNode.next;

        newLastNode.next = null;

        return newHead;
    }
}