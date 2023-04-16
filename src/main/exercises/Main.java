package main.exercises;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Exercises ans = new Exercises();

    // ans.q_1();
    // ans.q_2();
    // ans.q_3();
    // ans.q_4();
    // ans.q_5();
    // ans.q_6();
    // ans.q_7();
    // ans.q_8();
    // ans.q_9();
    // ans.q_10();

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

  public void q_7() {
    // Write a Java program that takes a number as input and prints its multiplication table upto 10.
    int a = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", a, i, a * i);
    }
  }

  public void q_8() {
    /*
    Write a Java program to display the following pattern.
    Sample Pattern :

         J    a   v     v  a                                                  
         J   a a   v   v  a a                                                 
      J  J  aaaaa   V V  aaaaa                                                
       JJ  a     a   V  a     a
     */
    System.out.println(
      """
           J    a   v     v  a   
           J   a a   v   v  a a  
        J  J  aaaaa   V V  aaaaa 
         JJ  a     a   V  a     a
      """);
  }
  public void q_9(){
    /*
    Write a Java program to compute the specified expressions and print the output.
    Test Data:
      ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     */
    System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
  }
  public void q_10(){
    /*
    Write a Java program to compute a specified formula.
    Specified Formula :
      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
     */
    System.out.println((4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))));
  }
}