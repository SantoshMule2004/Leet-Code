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
class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode t = head;
        ListNode h = head.next.next;

        while(h != null && h.next != null){
            t = t.next;
            h = h.next.next;
        }
        t.next = t.next.next;

        return head;
    }
}