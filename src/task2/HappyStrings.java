package task2;

import java.util.List;

public class HappyStrings {

    public static int numberOfHappyStrings(List<String> strings){
        if(strings.isEmpty()||strings==null){
            return -1;
        }
        int count =0;
        for (String s : strings){
            boolean isUnique = true;
            for(int i=0; i<s.length(); i++) {

                for (int j = i+1; j < s.length(); j++) {
                    if ( s.charAt(i) == s.charAt(j)) {
                        isUnique = false;
                        break;

                    }
                }
                if (!isUnique) {
                    break;
                }
            }
            if(isUnique){
                count++;
            }
        }
        return count;
    }
}
