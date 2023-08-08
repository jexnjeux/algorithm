package programmers.level0;

import java.util.ArrayList;

public class P181867 {

  public int[] solution(String myString) {
//    String[] arr = myString.split("x");
//    int[] answer = new int[arr.length];
//    for (int i = 0; i < arr.length; i++) {
//      answer[i] = arr[i].length();
//    }
//
//    return answer;

    ArrayList<Integer> list = new ArrayList<>();
    int cnt = 0;
    for (char c : myString.toCharArray()) {
      if (c == 'x') {
        list.add(cnt);
        cnt = 0;
      } else {
        cnt++;
      }
    }
    list.add(cnt);

    int[] answer = new int[list.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }
    return answer;
  }


}
