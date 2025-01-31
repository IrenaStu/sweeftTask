package Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidSequence {



    //workable  but not the best approach
    public static boolean isValidSequence(int[] array, int[] sequence){
        if(array==null || sequence==null|| array.length<sequence.length){
            return false;
        }
        // list declaration to pick matching numbers in order
        List<Integer> arrsList = new ArrayList<>();

        // Iterate over `array`
        for(Integer num1 : array){
            for (Integer num2 : sequence){
                if(num1==num2){
                    arrsList.add(num1);
                    break;
                }
            }
        }
        // transfer to list for using equals comparison which also tracks order
        List<Integer> sequenceList = Arrays.stream(sequence).boxed().collect(Collectors.toList());

        // Check if all sequence elements matched
        if (!arrsList.equals(sequenceList)){
            return false;
        }

        return true;
    }

     // best practice approach

    public static boolean isValidSequence2(int[] array, int[] sequence) {
        if (array == null || sequence == null || sequence.length > array.length) {
            return false;
        }

        int seqIndex = 0;
        // Iterate over `array`
        for (int num : array) {
            if (seqIndex < sequence.length && num == sequence[seqIndex]) {
                seqIndex++;  // Move to next sequence element
            }
        }
     // Check if all sequence elements matched

        return seqIndex == sequence.length;
    }

}
