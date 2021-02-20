package hRJavaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numbLines = scanner.nextInt();
    String numbInts = scanner.nextLine();
    ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>(numbLines);
    for(int i = 0; i < numbLines; i++) {
      numbInts = scanner.nextLine();
      array.add(i, new ArrayList<String>(Arrays.asList(numbInts.split("\\s"))));
    }

    int query = scanner.nextInt();
    for(int i = 0; i < query; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      if (x <= array.size() && y < array.get(x - 1).size() && y >=0) {
          System.out.println(array.get(x - 1).get(y));
      } else {
          System.out.println("ERROR!");
      }
    }
  }

}
