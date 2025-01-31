package task4;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static int[] findIntersection(int[] nums1, int[] nums2){

        if(nums1==null|| nums2==null){
            return new int[0];
        }
        Set<Integer> listOfCommonNumbers = new HashSet<>();
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    listOfCommonNumbers.add(nums1[i]);
                    break;
                }

            }

        }
        int[] result = listOfCommonNumbers.stream().mapToInt(Integer::intValue).toArray();


        return result;
    }


    public static int[] findIntersection2(int[] nums1, int[] nums2) {
        // Handle null input
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }

        // Use a set to store elements of nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Use a set to store the intersection
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert the resultSet to an int[] using streams
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
