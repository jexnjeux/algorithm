package programmers.level1;

public class P86051 {

  public int solution(int[] numbers) {
    int answer = 0;

    for (int i = 1; i < 10; i++) {
      answer += i;
    }

    for (int number : numbers) {
      answer -= number;
    }

    return answer;
  }

}
