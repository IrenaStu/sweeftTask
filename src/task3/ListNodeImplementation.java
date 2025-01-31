package task3;

public class ListNodeImplementation {

    // static method to print listNode
    public static void printNode(ListNode current){
        while (current!=null){
            System.out.println(current.value+" ");
            current=current.next;
        }
    }
}
