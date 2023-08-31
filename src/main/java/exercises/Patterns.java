package main.java.exercises;

//? Questions: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

public class Patterns {

  static void q1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void q2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }

  static void q3(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.printf("%d ", j + 1);
      }
      System.out.print("\n");
    }
  }

  static void q4(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.printf("%d ", i + 1);
      }
      System.out.print("\n");
    }
  }

  static void q5(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }

  static void q6(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = n; j > i; j--) {
        System.out.printf("%d ", n - j + 1);
      }
      System.out.print("\n");
    }
  }

  static void q7(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (2 * i) + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void q8(int n) {
    for (int i = n - 1; i > -1; i--) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (2 * i) + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void q9(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < ((2 * i) + 1) / 2 + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n - 1; i > -1; i--) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < ((2 * i) + 1) / 2 + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void q10(int n) {
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void q11(int n) {
    int toPrint = 1;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        toPrint = 1;
      } else {
        toPrint = 0;
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(toPrint + " ");
        toPrint = 1 - toPrint;
      }
      System.out.println();
    }
  }

  static void q12(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" " + j);
      }
      for (int j = 0; j < (3 * n + 1) - (4 * i); j++) {
        System.out.print(" ");
      }
      for (int j = i; j > 0; j--) {
        System.out.print(" " + j);
      }
      System.out.println();
    }
  }

  static void q13(int n) {
    int counter = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.printf("%d ", counter);
        counter++;
      }
      System.out.println();
    }
  }

  static void q14(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = (int) 'A'; j <= (int) 'A' + i; j++) {
        System.out.print((char) j);
      }
      System.out.println();
    }
  }

  static void q15(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = (int) 'A'; j < (int) 'A' + n - i; j++) {
        System.out.print((char) j);
      }
      System.out.println();
    }
  }

  static void q16(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = (int) 'A'; j <= (int) 'A' + i; j++) {
        System.out.print((char) (i + (int) 'A'));
      }
      System.out.println();
    }
  }

  static void q17(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print((char)('A' + j));
      }
      for (int j = i; j > 0; j--) {
        System.out.print((char)('A' + j - 1));
      }
      System.out.println();
    }
  }

  static void q18(int n) {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (((int) 'A') + n - j - 1) + " ");
      }
      System.out.println();
    }
  }

  static void q19(int n) {
    //TODO
  }

  static void q20(int n) {
    //TODO
  }

  static void q21(int n) {
    for (int i = 0; i < n; i++) {
      if (i == 0 || i == n - 1) {
        for (int j = 0; j < n; j++) {
          System.out.print("*");
        }
      } else {
        System.out.print("*");
        for (int j = 0; j < n - 2; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  static void q22(int n) {
    //TODO
  }
}
