import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveNodes {
    public ListNode removeNodes(ListNode head) {
        Deque<ListNode> stk = new ArrayDeque<>();
        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        dummy.next = head;
        ListNode curr = head;
        stk.push(dummy);

        while(curr != null) {
            boolean flag = false;
            while(!stk.isEmpty() && stk.peek().val < curr.val) {
                stk.pop();
                flag = true;
            }

            if(flag == true && !stk.isEmpty())
                stk.peek().next = curr;

            stk.push(curr);
            curr = curr.next;
        }
        return dummy.next;
    }
}
