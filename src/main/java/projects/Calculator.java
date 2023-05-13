package main.java.projects;

public class Calculator {
  public float add(float a, float b) {
    /*
     * Add two numbers
     */
    return a + b;
  }

  public float sub(float a, float b) {
    /*
     * Subtract two numbers
     */
    return a - b;
  }

  public float prod(float a, float b) {
    /*
     * Multiply two numbers
     */
    return a * b;
  }

  public float div(float a, float b) {
    /*
     * Divide two numbers
     */
    if (b != 0) {
      return a / b;
    } else {
      return 0;
    }
  }

  public float remainder(float a, float b) {
    /*
     * Get remainder by dividing two numbers
     */
    if (b != 0) {
      return a % b;
    } else {
      return 0;
    }
  }

  public int greatestInt(float num) {
    /*
     * Greatest Integer function
     */
    if (num > 0) {
      return (int) num;
    } else if (num < 0) {
      return (int) (num - 2 * num + 1);
    } else {
      return 0;
    }
  }

  public int power(int num, int power) {
    /*
     * Raise a number to a power (num^power)
     */
    int n = num;
    for (int i = 1; i < power; i++) {
      num *= n;
    }
    return num;
  }

  public int sqrt(int num) {
    /*
     * Square root of a number
     */
    return (int) Math.sqrt((double) num);

  }

  public float reciprocal(float num) {
    /*
     * Reciprocal of a number (1 / num)
     */
    return (1 / num);
  }
}