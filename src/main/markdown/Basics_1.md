:warning: at some places you may see variable declarations like
```java
 int a = 10, b = 4, c = 14;
```
If you are a beginner at java, this is just an alternative way to declare multiple same type variables while needing to specify type only once. more reference at [w3schools.com](https://www.w3schools.com/java/java_variables_multiple.asp)

---

1. Write a Java program to convert a decimal number to binary number. 
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101 
```java
public int decimalToBinary(int n) {
    String res = "";

    while (true) {
      res = n % 2 + res;
      n /= 2;
      if (n == 0 || n == 1) {
        res = n + res;
        break;
      }
    }
    return Integer.parseInt(res);
  }
```

2. Write a Java program to convert a binary number to decimal number. 
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4
```java
public int BinaryToDecimal(int a) {
    String nS = Integer.toString(a);
    int out = 0;

    for (int i = 0; i < nS.length(); i++) {
      out += Integer.parseInt(Character.toString(nS.charAt(nS.length() - i - 1))) * Math.pow(2, i);
    }
    return out;
  }
```


3. Write a Java program to compare two numbers. 
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39  
25 <= 39
```java
public String compareNumbers(int a, int b) {
    String out = "";

    if (a == b) { out = a + " == " + b + "\n"; }
    if (a != b) { out = a + " != " + b + "\n"; }
    if (a < b)  { out = a + " < " + b + "\n"; }
    if (a <= b) { out = a + " <= " + b + "\n"; }
    if (a > b)  { out = a + " > " + b + "\n"; }
    if (a >= b) { out = a + " >= " + b + "\n"; }
    return out;
  }
```

4. Write a Java program and compute the sum of the digits of an integer. 
Input Data:
Input an integer: 25
Expected Output
The sum of the digits is: 7
```java
public int sumDigits(int n) {
    String nS = Integer.toString(n);
    int sum = 0;

    for (int i = 0; i < nS.length(); i++) {
      sum += Integer.parseInt(Character.toString(nS.charAt(i)));
    }
    return sum;
  }
```


5. Write a Java program to count the letters, spaces, numbers and other characters of an input string. 
Expected Output:
The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23 
space: 9
number: 10 
other: 6
```java
public String countChars(String s) {
    int letters = 0, spaces = 0, digits = 0, others = 0;

    char[] chars = s.toCharArray();
    for (char c : chars) {
      if (Character.isDigit(c)) {
        digits++;
      } else if (Character.isLetter(c)) {
        letters++;
      } else if (Character.isSpaceChar(c)) {
        spaces++;
      } else {
        others = s.length() - (letters + spaces + digits);
      }
    }
    String out = String.format("length: %d\nletters: %d\nspaces: %d\ndigits: %d\nothers: %d", s.length(), letters, spaces, digits, others);
    return out;
  }
```

6. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
```java
public ArrayList<Integer> threeDigitNums() {
    ArrayList<Integer> nums = new ArrayList<>();

    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        for (int k = 1; k <= 4; k++) {
          if ((i != j) && (j != k) && (i != k)) {
            nums.add(Integer.parseInt("" + i + j + k));
          }
        }
      }
    }
    return nums;
  }
```

7. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. 
Sample Output:
Input number: 5  
5 + 55  + 555
```java
 public int sumMultipleDigit(int n) {
    String nS = Integer.toString(n);
    Integer out = Integer.parseInt(nS) + Integer.parseInt(nS + nS) + Integer.parseInt(nS + nS + nS);
    return out;
  }
```

8. Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1.
```java
public String nToOneByOperations(int n) {
    String out = "";

    while (n != 1) {
      if (n % 2 == 0) {
        n /= 2;
      } else if (n % 2 == 1) {
        n = (n * 3) + 1;
      }
      out += n + "\n";
    }
    return out;
  }
```

9. Write a Java program than read an integer and calculate the sum of its digits and write the number of each digit of the sum in English. 
```java
 public String numNames(int n) {
    String[] numNames = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" }, digits = Integer.toString(n).split("");
    String name = "";

    for (String a : digits) {
      name += " " + numNames[Integer.parseInt(a)]; 
    }
    return name;
  }
```

10. Write a Java program to count the number of even and odd elements in a given array of integers. 
```java
public String countEvenAndOddElements(int[] n) {
    int even = 0, odd = 0;
    for (int a : n) {
      if (a % 2 == 0) {
        even++;
      } else if (a % 2 == 1) {
        odd++;
      }
    }
    return "evens: " + even + "odds: " + odd;
  }
```

11. Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both. 
```java
public String elemSideToSide(int[] n) {
    int prev = 0, current = 0;
    boolean detect_10 = false, detect_20 = false;
    String out = "";

    for (int i = 1; i < n.length; i++) {
      prev = n[i - 1];
      current = n[i];

      boolean cond1 = (prev == 10) && (current == 10),
          cond2 = (prev == 20) && (current == 20);

      if (cond1) {
        out += String.format("\n10 side to side detected at index %d and %d\n", i - 1, i);
        detect_10 = true;
      } else if (cond2) {
        out += String.format("\n20 side to side detected at index %d and %d\n", i - 1, i);
        detect_20 = true;
      }
    }
    if (detect_10 && detect_20) {
      System.out.println("\n10 and 20 both detected side to side");
    }
    return out;
  }
```