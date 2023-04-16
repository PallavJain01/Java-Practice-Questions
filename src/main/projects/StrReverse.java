package main.projects;

public class StrReverse {
  public String main(String inp) {
    String out = "";
    for (int i = inp.length() - 1; i >= 0; i--) {
      out += inp.charAt(i);
    }
    return out;
  }
}
