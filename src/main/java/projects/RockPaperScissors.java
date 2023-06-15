package main.java.projects;

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

		String resultFormat = 
"""
\u001B[36m---------------------------------------
\u001B[32mScores:
  \u001B[34mUser: \u001B[32m%d
  \u001B[34mComputer: \u001B[32m%d
  \u001B[34mTies: \u001B[32m%d

\u001B[34mResult:
  \u001B[32m%s
\u001B[36m---------------------------------------
\u001B[37m
""";

		System.out.println(msg + "\n");

		int scoreComputer = 0
		, scoreUser = 0
		, Ties = 0;

		for (int i = 0; i++ < NumChances;) {
			int choiceComputer = rd.nextInt(0, 3)
			, choiceUser = sc.nextInt();
			if (choiceComputer == choiceUser) {
				choiceComputer = rd.nextInt(0, 3);
			}
			if (choiceUser > 2) {
				System.out.println("Invalid Input");
				System.out.println(msg);
				i--;
				continue;
			}
			System.out.println("\u001B[33mYou chose: " + choices[choiceUser] + "\u001B[37m");
			System.out.println("\u001B[33mComputer chose: " + choices[choiceComputer] + "\u001B[37m");

			boolean winComputer = (choiceComputer == 0 && choiceUser == 2) ||
					(choiceComputer == 1 && choiceUser == 0) ||
					(choiceComputer == 2 && choiceUser == 1);

			boolean winUser = (choiceComputer == 2 && choiceUser == 0) ||
					(choiceComputer == 0 && choiceUser == 1) ||
					(choiceComputer == 1 && choiceUser == 2);

			if (winUser) {
				scoreUser++;
				System.out.println("\u001B[35mUser Won!\u001B[37m\n");
			} else if (winComputer) {
				scoreComputer++;
				System.out.println("\u001B[35mComputer Won!\u001B[37m\n");
			} else if (!(winUser || winComputer)) {
				Ties++;
				System.out.println("\u001B[35mIts a Tie!\u001B[37m\n");
			}
		}
		sc.close();

		String winResult = "";

		if (scoreUser > scoreComputer) {
			winResult = "User Won the Game";
		} else if (scoreComputer > scoreUser) {
			winResult = "Computer Won the Game";
		} else if (scoreUser == scoreComputer) {
			winResult = "The game was a tie";
		}
		System.out.println(String.format(resultFormat, scoreUser, scoreComputer, Ties, winResult));
	}
}
