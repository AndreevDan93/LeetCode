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
    public ListNode deleteDuplicates(ListNode head) {
         if (head == null) {
            return null;
        }
        ListNode result = new ListNode(head.val);
        ListNode resultHead = result;
        head = head.next;
        while (head != null) {

            if (result.val != head.val) {
                result.next = new ListNode(head.val);
                result = result.next;
            }
            head = head.next;
        }
        return resultHead;
    }
}