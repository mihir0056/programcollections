package linkedlist;

public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        for(int i=1;i<=n+1;i++){
            first = first.next;
        }

        while(first !=null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;

    }
}
