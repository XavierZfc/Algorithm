
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode root = head;
        while (k != 0){
            root = root.next;
        }

        while (root != null){
            root = root.next;
            head = head.next;
        }
        return root;
    }
}