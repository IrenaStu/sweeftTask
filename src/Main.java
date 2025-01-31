import Task6.ValidSequence;
import task1.EvaluateExpression;
import task2.HappyStrings;
import task3.ListNode;
import task3.ListNodeImplementation;
import task3.ListNodeReverse;
import task4.Intersection;
import task5.LenOfSubarr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       // first task
        System.out.println("first task: " );

        String string = "5+20-8+5";
        System.out.println(EvaluateExpression.evaluateExpression(string));
        // end of task

        // second task
        System.out.println("Second task: ");
        List<String> stringToCheek = new ArrayList<>(Arrays.asList("abbcc", "abc","abcabc", "cabcbb"));
        // დავალებაში იყო მითიტებული პასუხი ორი მაგრამ ეს შეცდომაა რადგან მიტიტებულ სტრინგების
        // მასივსჰი მხოლოდ ერტი ელემენტი შედგება არა განმეორებადი სიმბოლოებისგან "abc"
        System.out.println(HappyStrings.numberOfHappyStrings(stringToCheek));
        // end of task

        // Third task
        System.out.println("Third task: ");
        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        ListNode reversed= ListNodeReverse.reverseList(head);

        ListNodeImplementation.printNode(reversed);
        // end of task

        //Fourth task
        System.out.println("Fourth task: ");
        int[] nums1 = {1,2,3,3,4,5};
        int [] nums2 = {3,4,4,5,6,7};
        System.out.println("second approach method: ");
        System.out.println(Arrays.toString(Intersection.findIntersection(nums1, nums2)));
        System.out.println("second approach method: ");
        System.out.println(Arrays.toString(Intersection.findIntersection2(nums1, nums2)));
        // end of task

        // Fifth task

        System.out.println("Fifth task: ");
        int [] array={6,2,2,3,4,1};
        int k=8;
        System.out.println(LenOfSubarr.lenOfLongSubarr(array,k));
        // end of task

        // Six task
        System.out.println("Six task: ");

        int [] arrays = {5,1,22,25,6,-1,8,10};
        int[] sequence = {1,6,-1,10};
        System.out.println("second approach method: ");
        System.out.println(ValidSequence.isValidSequence(arrays, sequence));
        System.out.println("second approach method: ");
        System.out.println(ValidSequence.isValidSequence2(arrays, sequence));
        // end of task
        // დავალებასჰი სიქვანსი იყო მოცემული ამ სახით sequence = [1,6-1,10] ჩავთვალე რომ ეს typo
        // არის რადგან მაშინ ელემენტი გმოდის 6-1=5 რაც არასწორ სჰედეგს მოგვცემდა
    }

}