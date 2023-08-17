package programmers.level0;

import java.util.Arrays;
import java.util.HashMap;

public class P120896 {

  public String solution(String s) {

    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    StringBuilder sb = new StringBuilder();
    for (char c : map.keySet()) {
      if (map.get(c) == 1) {
        sb.append(c);
      }
    }
    char[] arr = sb.toString().toCharArray();
    Arrays.sort(arr);
    return String.valueOf(arr);
  }
}
