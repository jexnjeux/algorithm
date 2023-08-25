package programmers.level1;

import java.util.HashMap;

public class P160586 {

  public int[] solution(String[] keymap, String[] targets) {
    int[] answer = new int[targets.length];
    HashMap<Character, Integer> map = new HashMap<>();

    for (String key : keymap) {
      for (int i = 0; i < key.length(); i++) {
        map.put(key.charAt(i), Math.min(i + 1, map.getOrDefault(key.charAt(i), Integer.MAX_VALUE)));
      }
    }

    for (int i = 0; i < targets.length; i++) {
      int cnt = 0;
      for (int j = 0; j < targets[i].length(); j++) {
        if (map.get(targets[i].charAt(j)) == null) {
          cnt = -1;
          break;
        }
        cnt += map.get(targets[i].charAt(j));
      }
      answer[i] = cnt;
    }

    return answer;
  }

}
