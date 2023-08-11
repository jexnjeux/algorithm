package programmers.level0;

import java.util.ArrayList;

public class P181844 {

  public int[] solution(int[] arr, int[] delete_list) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> delete = new ArrayList<>();

    for (int i : delete_list) {
      delete.add(i);
    }

    for (int i = 0; i < arr.length; i++) {
      if (!delete.contains(arr[i])) {
        list.add(arr[i]);
      }
    }

    int[] answer = new int[list.size()];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }

    return answer;


//    ArrayList<Integer> list = new ArrayList<>();
//    for (int i = 0; i < arr.length; i++) {
//      for (int j = 0; j < delete_list.length; j++) {
//        if (arr[i] == delete_list[j]) {
//          arr[i] = -1;
//        }
//      }
//    }
//
//    for (int i = 0; i < arr.length; i++) {
//      if (arr[i] != -1) {
//        list.add(arr[i]);
//      }
//    }
//
//    int[] answer = new int[list.size()];
//    for (int i = 0; i < answer.length; i++) {
//      answer[i] = list.get(i);
//    }
//    return answer;
  }

}
