public class IsPalindrome {
     private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode middle = middleNode(curr);
        ListNode revHead = reverseList(middle);

        curr = head;

        while(curr != null && revHead != null) {
            if(curr.val != revHead.val)
                return false;

            curr = curr.next;
            revHead = revHead.next;
        }
        return true;
    }
}
