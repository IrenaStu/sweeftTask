package task5;

import java.util.Arrays;

public class LenOfSubarr {


    public static  int lenOfLongSubarr(int[] array, int k){
        Arrays.sort(array);

        int sum =0;
        int count =0;
        int i =0;
        while( i<array.length&& sum+array[i]<=k){
            sum+=array[i];
            count++;
            i++;


        }
        return count;
    }



}
