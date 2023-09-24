package programmers.level3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class P67258 {

  public int[] solution(String[] gems) {
    int[] answer = new int[]{1, gems.length};
    int left = 0;
    int length = Integer.MAX_VALUE;
    HashMap<String, Integer> map = new HashMap<>();
    HashSet<String> set = new HashSet<>(Arrays.asList(gems));

    for (int right = 0; right < gems.length; right++) {
      map.put(gems[right], map.getOrDefault(gems[right], 0) + 1);
      while (map.size() == set.size()) {
        if (length > right - left) {
          length = right - left;
          answer = new int[]{left + 1, right + 1};

        }
        map.put(gems[left], map.get(gems[left]) - 1);
        if (map.get(gems[left]) == 0) {
          map.remove(gems[left]);
        }
        left++;
      }
    }

    return answer;
  }

}
