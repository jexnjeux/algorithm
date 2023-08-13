package programmers.level0;

public class P181831 {

  public int solution(int[][] arr) {
    int answer = 1;
    for (int i = 0; i < arr.length / 2; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] != arr[j][i]) {
          return 0;
        }
      }
    }
    return answer;
  }

}
