public class SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        int n = 1;
        while(curr.next != null) {
            curr = curr.next;
            n++;
        }

        curr = head;
        int kInd = n - k;
        int i = 1;
        while(i <= kInd) {
            curr = curr.next;
            i++;
        }

        ListNode kNode = curr;
        curr = head;

        i = 1;
        while(i < k) {
            curr = curr.next;
            i++;
        }

        int temp = curr.val;
        curr.val = kNode.val;
        kNode.val = temp;

        return head;
    }
}
