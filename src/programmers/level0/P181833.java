package programmers.level0;

public class P181833 {

  public int[][] solution(int n) {
    int[][] answer = new int[n][n];
    for (int i = 0; i < n; i++) {
      answer[i][i] = 1;
    }
//    for (int i = 0; i < answer.length; i++) {
//      for (int j = 0; j < answer[i].length; j++) {
//        if (i == j) {
//          answer[i][j] = 1;
//        }
//      }
//    }

    return answer;
  }

}
