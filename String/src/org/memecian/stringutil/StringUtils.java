/**
    @author ufhkt
 */
package org.memecian.stringutil;

public class StringUtils {


     public static String reverse(String word) {
        char[] rev = new char[word.length];
        int revIndex = 0;
        for (int i = word.length; i > 0; i--) {
            rev[revIndex] = word.charAt(i);
            revIndex++;
        }
        return String.valueOf(rev);
     }

    public static boolean isPalindrome(String word) {
        return (reverse(word).equals(word))
    }

    public static String removeCharacter(String word, int index) {
        char[] rem = new char[word.length - 1];
        for (int i = 0; i < word.length - 1; i++) {
            if (i != index) rem[i] = word.charAt(i);
        }
        return String.valueOf(rem);
    }

    
}

