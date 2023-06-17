package main.java.projects;

/**
 * @see main.java.projects.MatrixCalculator
 */
public class Calculator {
  /**
   * 
   * @param a
   * @param b
   * @return sum of a and b
   */
  public float add(float a, float b) {
    return a + b;
  }
  /**
   * 
   * @param a
   * @param b
   * @return difference of a and b
   */
  public float sub(float a, float b) {
    return a - b;
  }

  /**
   * 
   * @param a
   * @param b
   * @return product of two numbers
   */
  public float prod(float a, float b) {
    return a * b;
  }
  /**
   * 
   * @param a
   * @param b
   * @return division of two numbers
   */
  public float div(float a, float b) {
    if (b != 0) {
      return a / b;
    } else {
      return 0;
    }
  }
  /**
   * 
   * @param a
   * @param b
   * @return remainder of two numbers
   */
  public float remainder(float a, float b) {
    if (b != 0) {
      return a % b;
    } else {
      return 0;
    }
  }

  /**
   * 
   * @param num
   * @return [num] (greatest integer function on {@code num})
   */
  public int greatestInt(float num) {
    if (num > 0) {
      return (int) num;
    } else if (num < 0) {
      return (int) (num - 2 * num + 1);
    } else {
      return 0;
    }
  }

  /**
   * 
   * @param num
   * @param power
   * @return num raised to power {@code power}
   */
  public int power(int num, int power) {
    int n = num;
    for (int i = 1; i < power; i++) {
      num *= n;
    }
    return num;
  }

  /**
   * 
   * @param num
   * @return square root of the number
   */
  public int sqrt(int num) {
    return (int) Math.sqrt((double) num);

  }

  /**
   * 
   * @param num
   * @return inverse of a number ({@code 1 / num})
   */
  public float inverse(float num) {
    return (1 / num);
  }

  /**
   * 
   * @param num
   * @param index
   * @return digit of num at {@code index) <br />
   * -1 if the digit is non-existant
   */
  public int getDigit(long num, int index) {
    int digit = -1;
    for (int i = (int) Math.log10(num); i >= index; i--) {
      digit = (int) (num % 10);
      num /= 10;
    }
    return digit;
  }
  public long setDigit(long num, int index, int digit) {
    long newNum = 0;
    for (int i = 0; i < Math.log10(num); i++) {
      if (i == index) {
        newNum += digit;
      } else {
        newNum += getDigit(num, i);
      }
      newNum *= 10;
    }
    return newNum / 10;
  }
  public int setDigit(int num, int index, int digit) {
    int newNum = 0;
    for (int i = 0; i < Math.log10(num); i++) {
      if (i == index) {
        newNum += digit;
      } else {
        newNum += getDigit(num, i);
      }
      newNum *= 10;
    }
    return newNum / 10;
  }
  
}