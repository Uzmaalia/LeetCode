/**
 * Definition for singly-linked list.
 * public class ListNode { //Node
 *     int val; //data
 *     ListNode next; //next
 *     ListNode(int x) { val = x; } //constructor
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}