package programmers.level0;

public class P181938 {
  public static int solution(int a, int b) {
    int sum1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
    int sum2 = 2 * a * b;
    return Math.max(sum1, sum2);
  }

}
