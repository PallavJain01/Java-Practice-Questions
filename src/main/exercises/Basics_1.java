package main.exercises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Basics_1 {

  public static void main(String[] args) {
    
  }
}

class Solutions {

  Scanner sc = new Scanner(System.in);
  Random rd = new Random();

  public int decimalToBinary(int n) {
    /*
     * Convert decimal numbers into binary
     */
    String res = "";
    while (true) {
      res = n % 2 + res;
      n /= 2;
      if (n == 0 || n == 1) {
        res = n + res;
        break;
      }
    }
    return Integer.parseInt(res);
  }

  public int BinaryToDecimal(int a) {
    /*
     * Convert Binary numbers into decimal
     */
    String nS = Integer.toString(a);

    int out = 0;

    for (int i = 0; i < nS.length(); i++) {

      out += Integer.parseInt(Character.toString(nS.charAt(nS.length() - i - 1))) * Math.pow(2, i);
    }
    return out;
  }

  public void compareNumbers(int a, int b) {
    /*
     * Compare two numbers and print the result
     * using: [ ==, !=, <, <=, >, >= ]
     */

    if (a == b) {
      System.out.printf("%d == %d\n", a, b);
    }
    if (a != b) {
      System.out.printf("%d != %d\n", a, b);
    }
    if (a < b) {
      System.out.printf("%d <  %d\n", a, b);
    }
    if (a <= b) {
      System.out.printf("%d <= %d\n", a, b);
    }
    if (a > b) {
      System.out.printf("%d >  %d\n", a, b);
    }
    if (a >= b) {
      System.out.printf("%d >= %d\n", a, b);
    }
  }

  public int sumDigits(int n) {
    /*
     * compute the sum of the digits of an integer.
     */

    String nS = Integer.toString(n);
    int sum = 0;

    for (int i = 0; i < nS.length(); i++) {
      sum += Integer.parseInt(Character.toString(nS.charAt(i)));
    }
    return sum;
  }

  public void countChars(String s) {
    /*
     * count the letters, spaces, numbers and other characters of an input string.
     */
    int letters = 0;
    int spaces = 0;
    int digits = 0;
    int others = 0;

    char[] chars = s.toCharArray();
    for (char c : chars) {
      if (Character.isDigit(c)) {
        digits++;
      } else if (Character.isLetter(c)) {
        letters++;
      } else if (Character.isSpaceChar(c)) {
        spaces++;
      } else {
        others = s.length() - (letters + spaces + digits);
      }
    }
    System.out.printf("length: %d \nletters: %d \nspaces: %d \ndigits: %d \nothers: %d\n",
        s.length(), letters, spaces, digits, others);
  }

  public void threeDigitNums() {
    /*
     * create and display unique three-digit number using 1, 2, 3, 4; and count how
     * many three-digit numbers are there.
     */

    ArrayList<Integer> nums = new ArrayList<>();
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        for (int k = 1; k <= 4; k++) {
          if ((i != j) && (j != k) && (i != k)) {
            nums.add(Integer.parseInt("" + i + j + k));
          }
        }
      }
    }
    System.out.println(nums);
    System.out.println(nums.size());
  }

  public int sumMultipleDigit(int n) {
    /*
     * Accept an integer (n) and computes the value of n+nn+nnn.
     * Example-> input: 5, output = 605 (5+55+555)
     */
    String nS = Integer.toString(n);
    Integer out = Integer.parseInt(nS) + Integer.parseInt(nS + nS) + Integer.parseInt(nS + nS + nS);
    return out;
  }

  public void nToOneByOperations(int n) {
    /*
     * Java program start with an integer n, divide n by 2 if n is even or multiply
     * by 3 and add 1 if n is odd, repeat the process until n = 1.
     */
    while (n != 1) {
      if (n % 2 == 0) {
        n /= 2;
      } else if (n % 2 == 1) {
        n = (n * 3) + 1;
      }
      System.out.println(n);
      continue;
    }
  }

  public void numNames(int n) {
    /*
     * Input a number from the user and display the sum of digits.
     * Also display the user with each digit of the entered number converted into
     * english words.
     */

    String[] numNames = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

    String name = "";
    String[] digits = Integer.toString(n).split("");

    System.out.printf("Sum: %d\n", sumDigits(n));

    for (String a : digits) {
      name = numNames[Integer.parseInt(a)];
      System.out.printf("%s ", name);
    }
  }

  public String countEvenAndOddElements(int[] n) {
    /*
     * Count all even and odd numbers and return them.
     */
    int even = 0, odd = 0;
    for (int a : n) {
      if (a % 2 == 0) {
        even++;
      } else if (a % 2 == 1) {
        odd++;
      }
    }
    return "evens: " + even + "odds: " + odd;
  }

  public void elemSideToSide(int[] n) {
    /*
     * Test if an array of integers contains an element 10 next to 10 or an element
     * 20 next to 20, but not both.
     */
    int prev = 0;
    int current = 0;
    boolean detect_10 = false;
    boolean detect_20 = false;

    for (int i = 1; i < n.length; i++) {
      prev = n[i - 1];
      current = n[i];

      boolean cond1 = (prev == 10) && (current == 10);
      boolean cond2 = (prev == 20) && (current == 20);

      if (cond1) {
        System.out.printf("\n10 side to side detected at index %d and %d\n", i - 1, i);
        detect_10 = true;
      } else if (cond2) {
        System.out.printf("\n20 side to side detected at index %d and %d\n", i - 1, i);
        detect_20 = true;
      }
    }
    if (detect_10 && detect_20) {
      System.out.println("\n10 and 20 both detected side to side");
    }
  }

}
