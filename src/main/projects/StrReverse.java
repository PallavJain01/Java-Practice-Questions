package main.projects;

import java.util.Scanner;

/*
 * Write a java program to prompt the user for input and then return the string but reversed
 * For example: if user enters "hello world" then output should be "dlrow olleh"
*/


public class StrReverse {
  public void main() {
    Scanner sc = new Scanner(System.in);
    String inp = sc.nextLine();
    sc.close();
    String out = "";
    for (int i = inp.length() - 1; i >= 0; i--) {
      out += inp.charAt(i);
    }
    System.out.println(out);
  }
}
