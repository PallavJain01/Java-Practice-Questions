package main.projects;

import java.util.Scanner;
import java.util.Random;

public class NumGuessGame {
  Scanner sc = new Scanner(System.in);
  Random rd = new Random();

  public void main() {

    System.out.println("Enter minimum value");
    int min = sc.nextInt();
    System.out.println("Enter maximum value");
    int max = sc.nextInt();
    int num = rd.nextInt(min, max);

    System.out.println("Enter number of chances: ");
    int chances = sc.nextInt();

    System.out.printf("Start your guesses(%d to %d), Good luck!!\n", min, max);

    for (int i = 1; i <= chances; i++) {
      int inp = sc.nextInt();
      if (inp == num) {
        System.out.printf("You guessed the correct number in %d chances", i);
        break;
      }
      if (inp > num) {
        System.out.println("Your guess is greater than the original number");
        continue;
      }
      if (inp < num) {
        System.out.println("Your guess is smaller than the original number");
        continue;
      }
    }
  }
}
