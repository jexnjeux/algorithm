package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class P181866 {
  public String[] solution(String myString) {
    String[] arr = myString.split("x");
    ArrayList<String> list = new ArrayList<>();
    for (String s : arr) {
      if (!s.equals("")) {
        list.add(s);
      }
    }

    String[] answer = list.toArray(new String[0]);
    Arrays.sort(answer);

    return answer;
  }
}
