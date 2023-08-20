package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class P178871 {
  /*
  시간 초과 발생

  public String[] solution(String[] players, String[] callings) {
    for (int i = 0; i < callings.length; i++) {
      for (int j = 0; j < players.length; j++) {
        if (callings[i].equals(players[j])) {
          String tmp = players[j];
          players[j] = players[j - 1];
          players[j - 1] = tmp;
          break;
        }
      }
    }
    return players;
  }
   */

  public String[] solution(String[] players, String[] callings) {
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < players.length; i++) {
      map.put(players[i], i);
    }

    for (int i = 0; i < callings.length; i++) {
      int rank = map.get(callings[i]);

      String tmp = players[rank - 1];
      players[rank - 1] = callings[i];
      map.put(callings[i], rank - 1);

      players[rank] = tmp;
      map.put(tmp, rank);
    }

    return players;

  }


}
