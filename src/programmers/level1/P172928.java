package programmers.level1;

public class P172928 {

  public int[] solution(String[] park, String[] routes) {
    int[] answer = {};
    int x = -1;
    int y = -1;
    for (int i = 0; i < park.length; i++) {
      if (park[i].indexOf("S") >= 0) {
        x = i;
        y = park[i].indexOf("S");
      }
    }

    for (String route : routes) {
      String d = route.split(" ")[0];
      int n = Integer.parseInt(route.split(" ")[1]);
      int nx = x;
      int ny = y;
      for (int i = 0; i < n; i++) {
        switch (d) {
          case "E":
            ny++;
            break;
          case "W":
            ny--;
            break;
          case "S":
            nx++;
            break;
          case "N":
            nx--;
            break;
        }

        if (nx < 0 || ny < 0 || nx >= park.length || ny >= park[0].length()
            || park[nx].charAt(ny) == 'X') {
          nx = x;
          ny = y;
          break;
        }

      }
      x = nx;
      y = ny;
      answer = new int[]{x, y};

    }
    return answer;
  }


}
