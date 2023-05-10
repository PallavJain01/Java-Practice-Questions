package main.exercises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Basics_2 {
  public static void main(String[] args) {
    Solutions sol = new Solutions();
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8};
    sol.medianArr(arr);
  }
}

class Solutions {

  Scanner sc = new Scanner(System.in);
  Random rd = new Random();

  public ArrayList<Integer> largestThreeNums(ArrayList<Integer> n) {
    /*
     * Return the largest three numbers of an array.
     */
    n.sort(null);
    ArrayList<Integer> out = new ArrayList<>();

    for (int i = n.size() - 1; i > n.size() - 4; i--) {
      out.add(n.get(i));
    }
    return out;
  }

  public void equalOrNot() {
    /*
     * Get 4 integers as input from user and check if they are equal or not.
     * Print equal or not equal based on the result.
     */
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    boolean c1 = (a == b);
    boolean c2 = (a == c);
    boolean c3 = (a == d);
    boolean c4 = (b == c);
    boolean c5 = (b == d);
    boolean c6 = (c == d);

    if (c1 && c2 && c3 && c4 && c5 && c6) {
      System.out.println("Numbers are equal");
    } else {
      System.out.println("numbers are not equal");
    }
  }

  public int[][] changeRowAndColumn(int[][] arr) {
    /*
     * Interchange the rows and columns of a given 2-dimensional array.
     */
    int[][] out = new int[arr[0].length][arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        out[j][i] = arr[i][j];
      }
    }

    return out;
  }

  public ArrayList<Integer> seperatePositiveAndNegative(ArrayList<Integer> arr) {
    /*
     * In the given array, move every negative number to the left and positive
     * number to the right and sort them accordingly.
     */
    ArrayList<Integer> neg = new ArrayList<>();
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> out = new ArrayList<>();

    for (int n : arr) {
      if (n < 0) {
        neg.add(n);
        ;
      } else if (n >= 0) {
        pos.add(n);
      }
    }
    neg.sort(null);
    pos.sort(null);
    for (int a : neg) {
      out.add(a);
    }
    for (int a : pos) {
      out.add(a);
    }
    return out;
  }

  public ArrayList<Integer> moveZeroToRight(ArrayList<Integer> arr) {
    /*
     * In the given array, move every zero to the right side of a given array of
     * integers.
     */
    int countZero = 0;
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) == 0) {
        countZero++;
        arr.remove(i);
      }
    }
    for (int i = 0; i < countZero; i++) {
      arr.add(0);
    }
    return arr;
  }

  public int multiplyWithoutOperator(int a, int b) {
    /*
     * multiply two given integers without using the multiply operator(*).
     */
    int temp = a;
    for (int i = 1; i < b; i++) {
      a += temp;
    }
    return a;
  }

  public String revSentence(String str_words) {
    /*
     * reverse the content of a sentence (words seperated by space)
     * Example: hello world! -> world! hello
     */
    String[] arr_words = str_words.split(" ");
    String[] arr_words_rev = new String[arr_words.length];

    String str_words_rev = "";

    for (int i = 0; i < arr_words.length; i++) {
      arr_words_rev[arr_words.length - i - 1] = arr_words[i];
    }

    for (int i = 0; i < arr_words_rev.length; i++) {
      str_words_rev += arr_words_rev[i] + " ";
    }
    return str_words_rev;
  }

  public int longestSequence(int[] a) {
    /*
     * find the length of the longest consecutive sequence of a given array of
     * integers.
     */
    int count = 1;
    int longestCount = 1;
    for (int i = 1; i < a.length; i++) {
      if ((a[i] - a[i - 1]) == 1) {
        count++;
      } else if ((a[i] - a[i - 1] != 1)) {
        count = 1;
      }
      if (count > longestCount) {
        longestCount = count;
      }
    }
    switch (longestCount) {
      case 1:
        return longestCount;
      default:
        return longestCount + 1;
    }

  }

  public boolean subStr(String subStr, String main) {
    /*
     * accept two string and test if the second string contains the first one.
     */
    return main.contains(subStr);
  }

  public int getSmlIntegers(int[] main, int[] second) {
    /*
     * get the number of element in a given array of integers that are smaller than
     * the integer of another given array of integers.
     */
    int out = 0;
    for (int a : main) {
      for (int b : second) {
        if (a < b) {
          out++;
        }
      }
    }
    return out;
  }

  public void medianArr(int[] arr) {
    /*
     * find the median of the number inside the window (size k) at each moving in a
     * given array of integers with duplicate numbers. Move the window from the
     * start of the array.
     */ 
    // TODO
  }
}