package programmers.level0;

public class P181936 {

  public static int solution(int number, int n, int m) {
    int answer = 0;
    if (number % n == 0 && number % m == 0) {
      answer = 1;
    }
    return answer;
  }

}
