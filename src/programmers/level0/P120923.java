package programmers.level0;

public class P120923 {

  public int[] solution(int num, int total) {
    int[] answer = new int[num];
    int n = (total / num) - ((num - 1) / 2);

    for (int i = 0; i < num; i++) {
      answer[i] = n++;
    }

    return answer;
  }

}
