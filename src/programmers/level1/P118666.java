package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class P118666 {

  public String solution(String[] survey, int[] choices) {
    String answer = "";

    Map<Character, Integer> point = new HashMap<>();

    for (int i = 0; i < survey.length; i++) {
      if (choices[i] < 4) {
        point.put(survey[i].charAt(0),
            point.getOrDefault(survey[i].charAt(0), 0) + (4 - choices[i]));
      } else if (choices[i] > 4) {
        point.put(survey[i].charAt(1),
            point.getOrDefault(survey[i].charAt(1), 0) + (choices[i] - 4));
      }
    }

    answer += point.getOrDefault('R', 0) >= point.getOrDefault('T', 0) ? 'R' : 'T';
    answer += point.getOrDefault('C', 0) >= point.getOrDefault('F', 0) ? 'C' : 'F';
    answer += point.getOrDefault('J', 0) >= point.getOrDefault('M', 0) ? 'J' : 'M';
    answer += point.getOrDefault('A', 0) >= point.getOrDefault('N', 0) ? 'A' : 'N';

    return answer;
  }

}
