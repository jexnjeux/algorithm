package programmers.level0;

public class P181832 {

  public int[][] solution(int n) {
    int[][] answer = new int[n][n];
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    int x = 0, y = 0, d = 1;
    int cnt = 1;

    while (cnt <= n * n) {
      answer[x][y] = cnt;

      int nx = x + dx[d];
      int ny = y + dy[d];
      if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] > 0) {
        d = (d + 1) % 4;
        nx = x + dx[d];
        ny = y + dy[d];
      }

      x = nx;
      y = ny;
      cnt++;
    }

    return answer;
  }

}
