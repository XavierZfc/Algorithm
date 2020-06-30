
class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null) return null;
        visit(head);
        return root;
    }
    ListNode root ;
    ListNode visit (ListNode head ){
        if (head.next == null) {
            root = head;
            return head;
        }
        ListNode listNode = visit(head.next);
        listNode.next = head;
        head.next = null;

        return head;
    }
}