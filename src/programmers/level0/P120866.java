package programmers.level0;

public class P120866 {

  public int solution(int[][] board) {
    int answer = 0;
    int n = board.length;

    int[][] danger = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j] == 1) {
          danger[i][j] = 1;
          checkDanger(danger, j, i, n);
        }
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (danger[i][j] == 0) {
          answer++;
        }
      }

    }

    return answer;
  }

  public static void checkDanger(int[][] danger, int x, int y, int n) {
    int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
    int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};

    for (int i = 0; i < dx.length; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];

      if (nx >= 0 && nx <= n - 1 && ny >= 0 && ny <= n - 1) {
        if (danger[ny][nx] == 0) {
          danger[ny][nx] = 1;
        }
      }
    }

  }

}
