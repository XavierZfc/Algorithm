public class ListNode {

    ListNode front = null;
    ListNode next = null;

    int val ;
    public ListNode (){}
    public ListNode (ListNode front , ListNode next){
        this.front = front;
        this.next = next;
    }
    public ListNode (ListNode next){
        this.next = next;
    }

}
