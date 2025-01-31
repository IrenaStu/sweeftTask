package task5;

import java.util.Arrays;

public class LenOfSubarr {


    public static  int lenOfLongSubarr(int[] array, int k){
        // sort array in natural order
        Arrays.sort(array);
  // declare variables to track sum
        int sum =0;
        int count =0;
        int i =0;
        // lopping in array and performing adding digits until they reach value of K
        while( i<array.length&& sum+array[i]<=k){
            sum+=array[i];
            // counting performed iterations to track digits which where added
            count++;
            // incrementing while loop
            i++;


        }
        //return count which holds amount of digits  performing sum
        return count;
    }



}
