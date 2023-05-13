package main.java.exercises;

import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Solutions {

  Scanner sc = new Scanner(System.in);
  Random rd = new Random();

  public ArrayList<Integer> largestKNumbers(ArrayList<Integer> n, int k) {
    /*
     * Return the largest k numbers of an array.
     */
    n.sort(null);
    ArrayList<Integer> out = new ArrayList<>();

    for (int i = n.size() - 1; i > n.size() - k - 1; i--) {
      out.add(n.get(i));
    }
    return out;
  }

  public String equalOrNot(int a, int b, int c, int d) {
    /*
     * Get 4 integers as input from user and check if they are equal or not.
     * Print equal or not equal based on the result.
     */
    boolean c1 = (a == b)
    , c2 = (a == c)
    , c3 = (a == d)
    , c4 = (b == c)
    , c5 = (b == d)
    , c6 = (c == d);

    if (c1 && c2 && c3 && c4 && c5 && c6) {
      return "Numbers are equal";
    } else {
      return "numbers are not equal";
    }
  }

  public char[][] booleanArrToCharArr(boolean[][] boolArr) {
    /*
     * Convert the contents of a boolean array to a character array
     * true -> t; false -> f
     */
    char[][] out = new char[boolArr.length][boolArr[0].length];
    for (int i = 0; i < boolArr.length; i++) {
      for (int j = 0; j < boolArr[i].length; j++) {
        if (boolArr[i][j] == true) {
          out[i][j] = 't';
        } else if (boolArr[i][j] == false) {
          out[i][j] = 'f';
        }
      }
    }
    return out;
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
    ArrayList<Integer> neg = new ArrayList<>()
    , pos = new ArrayList<>()
    , out = new ArrayList<>();
    

    for (int n : arr) {
      if (n < 0) {
        neg.add(n);
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

  public String revSentence(String sentence) {
    /*
     * reverse the content of a sentence (words seperated by space)
     * Example: hello world! -> world! hello
     */
    String[] arr_words = sentence.split(" ")
    , arr_words_rev = new String[arr_words.length];

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
    int count = 1
    , longestCount = 1;

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
    if (longestCount == 1 ) {return 1;}
    else { return longestCount + 1;}
  }

  public boolean subStr(String subStr, String main) {
    /*
     * accept two string and test if the second string contains the first one.
     */
    return main.contains(subStr);
  }

  public int[] medianArr(int[] arr, int k) {
    /*
     * find the median of the number inside the window (size k) at each moving in a
     * given array of integers with duplicate numbers. Move the window from the
     * start of the array.
     */
    int[] out = new int[arr.length - k + 1];
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - k + 1; i++) {
      for (int winSize = 0; winSize < k; winSize++) {
        if (k % 2 == 1) {
          out[i] = arr[i + (k + 1) / 2 - 1];
        } else if (k % 2 == 0) {
          out[i] = (arr[i + (k / 2) - 1] + arr[i + (k / 2)]) / 2;
        }
      }
    }
    return out;
  }

  public int[] maxNumArr(int[] arr, int k) {
    /*
     * Find the maximum number inside the number in the window (size k) at each
     * moving in a given array of integers with duplicate numbers. Move the window
     * from the start of the array.
     */
    int[] out = new int[arr.length - k + 1];
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - k + 1; i++) {
      out[i] = arr[i + k - 1];
    }
    return out;
  }

  public LinkedList<Integer> deleteNode(LinkedList<Integer> linkLst, int nodeIndex) {
    /*
     * delete a specified node in the middle of a singly linked list.
     */
    linkLst.remove(nodeIndex);
    return linkLst;
  }

  public int[] partitionArray(int[] arr) {
    /*
     * partition an given array of integers into even number first and odd number
     * second.
     */

    ArrayList<Integer> sum_arr = new ArrayList<>()
    , evens = new ArrayList<>()
    , odds = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evens.add(arr[i]);
      } else if (arr[i] % 2 == 1) {
        odds.add(arr[i]);
      }
    }
    sum_arr.addAll(0, evens);
    sum_arr.addAll(sum_arr.size(), odds);
    int[] out = sum_arr.stream().mapToInt(i -> i).toArray();
    return out;
  }
}