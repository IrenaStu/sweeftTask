package task3;

public class ListNodeReverse {

    public static ListNode reverseList(ListNode head){
        ListNode previous = null;
        ListNode next = null;
        ListNode current = head;


        while (current!=null){
            next = current.next;
            current.next=previous;
            previous=current;
            current =next;
        }
        return previous;
    }
}
