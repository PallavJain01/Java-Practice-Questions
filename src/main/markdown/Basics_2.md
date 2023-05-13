:warning: at some places you may see variable declarations like
```java
 int a = 10, b = 4, c = 14;
```
If you are a beginner at java, know that this is just an alternative way to declare multiple same type variables while needing to specify type only once. more reference at [w3schools.com](https://www.w3schools.com/java/java_variables_multiple.asp)

---

1. Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order. 
Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
100 25 17
```java
public ArrayList<Integer> largestKNumbers(ArrayList<Integer> n, int k) {
    n.sort(null);
    ArrayList<Integer> out = new ArrayList<>();

    for (int i = n.size() - 1; i > n.size() - k - 1; i--) {
      out.add(n.get(i));
    }
    return out;
  }
```

2. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise. 
Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!
```java
public String equalOrNot(int a, int b, int c, int d) {
    boolean c1 = (a == b)
    , c2 = (a == c)
    , c3 = (a == d)
    , c4 = (b == c)
    , c5 = (b == d)
    , c6 = (c == d);

    if (c1 && c2 && c3 && c4 && c5 && c6) {
      return "Numbers are equal";
    } else {
      return "numbers are not equal";
    }
  }

```
3. Write a Java program to print the contents of a two-dimensional Boolean array where t will represent true and f will represent false. 
Sample array:
array = {{true, false, true},
{false, true, false}};
Expected Output :
t f t
f t f
```java
public char[][] booleanArrToCharArr(boolean[][] boolArr) {
    char[][] out = new char[boolArr.length][boolArr[0].length];

    for (int i = 0; i < boolArr.length; i++) {
      for (int j = 0; j < boolArr[i].length; j++) {
        if (boolArr[i][j] == true) {
          out[i][j] = 't';
        } else if (boolArr[i][j] == false) {
          out[i][j] = 'f';
        }
      }
    }
    return out;
}
```
4. Write a Java program to print an array after changing the rows and columns of a given two-dimensional array. 
Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:
10 40
20 50 
30 60
```java
public int[][] changeRowAndColumn(int[][] arr) {
    int[][] out = new int[arr[0].length][arr.length];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        out[j][i] = arr[i][j];
      }
    }

    return out;
  }
```

5. Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers. 
Expected Output:
Original array: [-2, 3, 4, -1, -3, 1, 2, -4, 0]
Result: [-4, -3, -2, -1, 0, 1, 2, 3, 4]
```java
public ArrayList<Integer> seperatePositiveAndNegative(ArrayList<Integer> arr) {
    ArrayList<Integer> neg = new ArrayList<>()
    , pos = new ArrayList<>()
    , out = new ArrayList<>();    

    for (int n : arr) {
      if (n < 0) {
        neg.add(n);
      } else if (n >= 0) {
        pos.add(n);
      } }
    neg.sort(null);
    pos.sort(null);
    for (int a : neg) {
      out.add(a);
    }
    for (int a : pos) {
      out.add(a);
    }
    return out;
  }
```
6. Write a Java program to move every zero to the right side of a given array of integers. 
Original array: [0, 3, 4, 0, 1, 2, 5, 0]
Result: [3, 4, 1, 2, 5, 0, 0, 0]
```java
public ArrayList<Integer> moveZeroToRight(ArrayList<Integer> arr) {
    int countZero = 0;

    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) == 0) {
        countZero++;
        arr.remove(i);
      }
    }
    for (int i = 0; i < countZero; i++) {
      arr.add(0);
    }
    return arr;
  }
```

7. Write a Java program to multiply two given integers without using the multiply operator(*).
Input the first number: 25
Input the second number: 5
Result: 125
```java
public int multiplyWithoutOperator(int a, int b) {
    int temp = a;

    for (int i = 1; i < b; i++) {
      a += temp;
    }
    return a;
  }
```

8. Write a Java program to reverse the content of a sentence (assume a single space between two words) without reverse every word. 
Input a string: The quick brown fox jumps over the lazy dog
Result: dog lazy the over jumps fox brown quick The
```java
public String revSentence(String sentence) {
    String[] arr_words = sentence.split(" ")
    , arr_words_rev = new String[arr_words.length];

    String str_words_rev = "";

    for (int i = 0; i < arr_words.length; i++) {
      arr_words_rev[arr_words.length - i - 1] = arr_words[i];
    }

    for (int i = 0; i < arr_words_rev.length; i++) {
      str_words_rev += arr_words_rev[i] + " ";
    }
    return str_words_rev;
  }
```
9. Write a Java program to find the length of the longest consecutive sequence of a given array of integers. 
Original array: [1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2]
7
```java
public int longestSequence(int[] a) {
    int count = 1
    , longestCount = 1;

    for (int i = 1; i < a.length; i++) {
      if ((a[i] - a[i - 1]) == 1) {
        count++;
      } else if ((a[i] - a[i - 1] != 1)) {
        count = 1;
      }
      if (count > longestCount) {
        longestCount = count;
      }
    }
    if (longestCount == 1 ) {return 1;}
    else { return longestCount + 1;}
  }
```

10. Write a Java program to accept two string and test if the second string contains the first one.
Input first string: Once in a blue moon
Input second string: See eye to eye
If the second string contains the first one? false

```java
public boolean subStr(String subStr, String main) {
    return main.contains(subStr);
  }
```

11. Write a Java program to find the median of the number inside the window (size k) at each moving in a given array of integers with duplicate numbers. Move the window from the start of the array.
Sample input: 
{ 1, 2, 3, 4, 5, 6, 7, 8, 8 }
value of k: 3
output:
{ 2, 3, 4, 5, 6, 7, 8 }
```java
 public int[] medianArr(int[] arr, int k) {
    int[] out = new int[arr.length - k + 1];
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - k + 1; i++) {
      for (int winSize = 0; winSize < k; winSize++) {
        if (k % 2 == 1) {
          out[i] = arr[i + (k + 1) / 2 - 1];
        } else if (k % 2 == 0) {
          out[i] = (arr[i + (k / 2) - 1] + arr[i + (k / 2)]) / 2;
        }
      }
    }
    return out;
  }
```


12. Write a Java program to find the maximum number inside the number in the window (size k) at each moving in a given array of integers with duplicate numbers. Move the window from the start of the array. 
sample input:
{ 1, 2, 3, 4, 5, 6, 7, 8, 8 }
value of k: 3
output:
{ 3, 4, 5, 6, 7, 8, 8 }
```java
public int[] maxNumArr(int[] arr, int k) {
    int[] out = new int[arr.length - k + 1];

    Arrays.sort(arr);
    for (int i = 0; i < arr.length - k + 1; i++) {
      out[i] = arr[i + k - 1];
    }
    return out;
  }
```
13. Write a Java program to delete a specified node in the middle of a singly linked list. 
sample singly linked list: 10->20->30->40->50
node to be deleted: 4th i.e. 40
result: 10->20->30->50
```java
public LinkedList<Integer> deleteNode(LinkedList<Integer> linkLst, int nodeIndex) {
    linkLst.remove(nodeIndex);
    return linkLst;
  }
```
14. Write a Java program to partition an given array of integers into even number first and odd number second.
input: [7, 2, 4, 1, 3, 5, 6, 8, 2, 10]
After partition the said array becomes: [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
```java
  public int[] partitionArray(int[] arr) {
    ArrayList<Integer> sum_arr = new ArrayList<>()
    , evens = new ArrayList<>()
    , odds = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evens.add(arr[i]);
      } else if (arr[i] % 2 == 1) {
        odds.add(arr[i]);
      }
    }
    sum_arr.addAll(0, evens);
    sum_arr.addAll(sum_arr.size(), odds);
    int[] out = sum_arr.stream().mapToInt(i -> i).toArray();
    return out;
  }
```
