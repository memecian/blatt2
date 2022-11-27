package org.ufhkt.stringutil;
public class Test {
  public static void main(String[] args) {
    int casted1 = (int) 'a';
    int casted2 = (int) 'z';

    System.out.println(casted1);
    System.out.println(casted2);


    System.out.printf("owo & woo %b; uwu & uWuu %b", StringUtils.isAnagram("owo", "woo"), StringUtils.isAnagram("uwu", "uWuu"));
  }
}