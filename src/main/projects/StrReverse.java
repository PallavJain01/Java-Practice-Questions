package main.projects;

import java.util.Scanner;

public class StrReverse {
  public String main() {
    Scanner sc = new Scanner(System.in);
    String inp = sc.nextLine();
    sc.close();
    String out = "";
    for (int i = inp.length()- 1; i >= 0; i--) {
      out += inp.charAt(i);
    }
    return out;
  }
}
