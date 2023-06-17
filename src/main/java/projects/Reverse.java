package main.java.projects;

public class Reverse {
  /**
   * 
   * @param string
   * @return reversed string
   */
  public String string(String str) {
    String rev_str = "";
    for (int i = 0; i < str.length(); i++) {
      rev_str += str.charAt(str.length() - i - 1);
    }
    return rev_str;
  }
  
  /**
   * 
   * @param array (1 dimentional)
   * @return reversed array
   */
  public int[] array(int[] arr) {
    int[] rev_arr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      rev_arr[i] = arr[arr.length - i - 1];
    }
    return rev_arr;
  }

  /**
   * 
   * @param num
   * @return reversed number
   */
  public long number(long num)  {
    Calculator calc = new Calculator();
    long rev_num = 0;
    for (int i = (int) Math.log10(num); i >= 0 ; i--) {
       rev_num += calc.getDigit(num, i);
       rev_num *= 10;
    }
    return rev_num / 10;
  }
}
