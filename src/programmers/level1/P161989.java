package programmers.level1;

public class P161989 {

  public int solution(int m, int[] section) {
    int answer = 1;
    int end = section[0] + m - 1;
    for (int item : section) {
      if (end < item) {
        end = item + m - 1;
        answer++;
      }
    }
    return answer;
  }

}
