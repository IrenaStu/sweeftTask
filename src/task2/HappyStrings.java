package task2;

import java.util.List;

public class HappyStrings {

    public static int numberOfHappyStrings(List<String> strings){
        // cheek string not to be null
        if(strings.isEmpty()||strings==null){
            return -1;
        }
        // declaring variable to count substrings with unique input
        int count =0;

        // looping through list
        for (String s : strings){
            // declaring boolean to track if substring is unique
            boolean isUnique = true;
            //outer loop for substring comparison
            for(int i=0; i<s.length(); i++) {
           // inner loop for comparison
                for (int j = i+1; j < s.length(); j++) {
                    //comparing index i element to the rest elements in substring except itself
                    if ( s.charAt(i) == s.charAt(j)) {
                        isUnique = false;
                        break;

                    }
                }
                //breaking outer loop if found duplication
                if (!isUnique) {
                    break;
                }
            }
            // counting unique substrings
            if(isUnique){
                count++;
            }
        }
        return count;
    }
}
