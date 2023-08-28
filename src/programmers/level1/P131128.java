package programmers.level1;

public class P131128 {

  public String solution(String X, String Y) {
    // String answer = ""; 시간초과 발생
    StringBuilder answer = new StringBuilder();
    int[] xArr = new int[10];
    int[] yArr = new int[10];

    for (int i = 0; i < X.length(); i++) {
      xArr[X.charAt(i) - '0']++;
    }
    for (int i = 0; i < Y.length(); i++) {
      yArr[Y.charAt(i) - '0']++;
    }

    for (int i = 9; i >= 0; i--) {

      for (int j = 0; j < Math.min(xArr[i], yArr[i]); j++) {
        answer.append(i);
      }
    }

    if (answer.isEmpty()) {
      return "-1";
    } else if (answer.toString().charAt(0) - '0' == 0) {
      return "0";
    } else {
      return answer.toString();
    }

  }
}
