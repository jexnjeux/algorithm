package programmers.level0;

import java.util.ArrayList;

public class P181861 {

  public int[] solution(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i]; j++) {
        list.add(arr[i]);
      }
    }
    int[] answer = new int[list.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }

    return answer;
  }

}
