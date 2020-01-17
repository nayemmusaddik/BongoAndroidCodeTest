package question1;

import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean rslt;
        if (s1.length() != s2.length()) {
            rslt = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            rslt = Arrays.equals(ArrayS1, ArrayS2);
        }
            return rslt;
    }
    /*Find the test method in tests directory*/


}
