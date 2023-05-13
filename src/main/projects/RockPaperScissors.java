package main.projects;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public void start() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		String msg = "0:ROCK | 1:PAPER | 2:SCISSORS";
		String[] choices = { "ROCK", "PAPER", "SCISSORS" };

		System.out.print("Enter number of chances: ");
		int NumChances = sc.nextInt();

		System.out.println(msg + "\n");

		int scoreComputer = 0;
		int scoreUser = 0;
		int Ties = 0;

		for (int i = 0; i < NumChances; i++) {
			int choiceComputer = rd.nextInt(0, 3);
			int choiceUser = sc.nextInt();
			if (choiceComputer == choiceUser) {
				choiceComputer = rd.nextInt(0, 3);
			}
			if (choiceUser > 2) {
				System.out.println("Invalid Input");
				System.out.println(msg);
				i--;
				continue;
			}
			System.out.println("You chose: " + choices[choiceUser]);
			System.out.println("Computer chose: " + choices[choiceComputer]);

			boolean winUser = (choiceComputer == 0 && choiceUser == 2) ||
					(choiceComputer == 1 && choiceUser == 0) ||
					(choiceComputer == 2 && choiceUser == 1);

			boolean winComputer = (choiceComputer == 2 && choiceUser == 0) ||
					(choiceComputer == 0 && choiceUser == 1) ||
					(choiceComputer == 1 && choiceUser == 2);

			if (winUser) {
				scoreUser++;
				System.out.println("User Won!\n");
			} else if (winComputer) {
				scoreComputer++;
				System.out.println("Computer Won!\n");
			} else if (!(winUser || winComputer)) {
				Ties++;
				System.out.println("Its a Tie!\n");
			}
		}
		sc.close();

		System.out.printf("\nUser: %d\nComputer: %d\nTies: %d\n", scoreUser, scoreComputer, Ties);

		if (scoreUser > scoreComputer) {
			System.out.println("\nUser won the game!");
		} else if (scoreComputer > scoreUser) {
			System.out.println("\nComputer won the game!");
		} else if (scoreUser == scoreComputer) {
			System.out.println("\nThe game was a tie!");
		}
	}
}
