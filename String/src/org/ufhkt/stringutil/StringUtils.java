/**
    @author ufhkt
 */
package org.ufhkt.stringutil;

public class StringUtils {

  public static String reverse(String word) {
    char[] rev = new char[word.length()];
    int revIndex = 0;
    for (int i = word.length(); i > 0; i--) {
      rev[revIndex] = word.charAt(i);
      revIndex++;
    }
    return String.valueOf(rev);
  }

  public static boolean isPalindrome(String word) {
    return (reverse(word).equals(word));
  }

  public static String removeCharacter(String word, int index) {
    char[] rem = new char[word.length() - 1];
    for (int i = 0; i < word.length() - 1; i++) {
      if (i != index)
        rem[i] = word.charAt(i);
    }
    return String.valueOf(rem);
  }

  public static boolean isAnagram(String one, String two) {
    // exclude String pairs of different lengths
    if (one.length() != two.length()) return false;
    
    // this works assuming we use ascii
    int alphabetLen = 25;
    int[] occurrs1 = new int[alphabetLen];
    int[] occurrs2 = new int[alphabetLen];
    char[] copy1 = one.toLowerCase().toCharArray();
    char[] copy2 = two.toLowerCase().toCharArray();
    /* magic time:
      25 letters occupying ASCII codes 97 (a) - 122 (z) (dec). chars can be implicitly
      converted to ints, thus they can be used as array indices without problems.*/
    for (char i : copy1) occurrs1[i - 97]++;
    for (char i : copy2) occurrs2[i - 97]++;
    for (int i = 0; i < alphabetLen; i++) {
      if (copy1[i] != copy2[i]) return false;
    }
    return true;
  }

}
