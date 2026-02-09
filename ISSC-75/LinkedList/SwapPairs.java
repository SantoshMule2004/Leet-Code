public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null && curr.next != null) {
            ListNode second = curr.next;
            prev.next = second;
            curr.next = second.next;
            second.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}
