package programmers.level0;

import java.util.Scanner;

public class P181950 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(str);
    }
    String result = str.toString();
    System.out.println(result);

  }

}
