package main.exersises;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Exercises ans = new Exercises();

    // ans.q_1();
    // ans.q_2();
    // ans.q_3();
    // ans.q_4();
    // ans.q_5();
    ans.q_6();

  }
}

class Exercises {
  Scanner sc = new Scanner(System.in);

  public void q_1() {
    // Write a Java program to print 'Hello' on screen and then print your name on a separate line.
    System.out.println("Hello\nPallav Jain");
  }

  public void q_2() {
    // Write a Java program to print the sum of two numbers.
    System.out.println(74 + 36);
  }

  public void q_3() {
    // Write a Java program to divide two numbers and print on the screen.
    System.out.println(50 / 3);
  }

  public void q_4() {
    // Write a Java program to print the result of the following operations.
    System.out.println((-5 + 8 * 6) + "\n" +
        ((55 + 9) % 9) + "\n" +
        (20 + -3 * 5 / 8) + "\n" +
        (5 + 15 / 3 * 2 - 8 % 3));
  }

  public void q_5() {
    // Write a Java program that takes two numbers as input and display the product of two numbers.
    System.out.print("Input first number: ");
    int n1 = sc.nextInt();
    System.out.print("Input second number: ");
    int n2 = sc.nextInt();
    System.out.printf("%d x %d = %d", n1, n2, (n1 * n2));
  }

  public void q_6() {
    // Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
    System.out.printf("%.2f - %.2f = %.2f\n", a, b, a - b);
    System.out.printf("%.2f * %.2f = %.2f\n", a, b, a * b);
    System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
    System.out.printf("%.2f mod %.2f = %.2f", a, b, a % b);
  }
}