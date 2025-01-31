package task3;

public class ListNodeReverse {


    // method to reverse
    public static ListNode reverseList(ListNode head){

        // declaring nodes which support movement of nodes
        ListNode previous = null;
        ListNode next = null;
        ListNode current = head;

// while loop to ensure movement will continue until head won't point to null
        while (current!=null){
            // moving next to next.current value first iteration 2
            next = current.next;
          //  current.next move to previous first iteration null
            current.next=previous;
            // move current node to previous first iteration 1
            previous=current;
            // move next to current   first iteration 2
            current =next;
        }
        //return previous on last iteration head is on previous pointing to next which is null
        return previous;
    }
}
