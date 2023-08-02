package programmers.level0;

import java.util.Arrays;

public class P181909 {
  public String[] solution(String my_string) {
    String[] answer = new String[my_string.length()];
    for (int i = 0; i < my_string.length(); i++) {
      answer[i] = my_string.substring(i);
    }
    Arrays.sort(answer);
    return answer;
  }

}
