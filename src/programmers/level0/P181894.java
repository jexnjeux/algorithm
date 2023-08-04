package programmers.level0;

import java.util.ArrayList;

public class P181894 {

  public int[] solution(int[] arr) {
//    1.
//    int cnt = 0;
//    for (int i = 0; i < arr.length; i++) {
//      if (arr[i] == 2) {
//        cnt++;
//      }
//    }
//
//    if (cnt == 0) {
//      return new int[]{-1};
//    } else {
//      boolean started = false;
//      ArrayList<Integer> list = new ArrayList<>();
//      for (int i = 0; i < arr.length; i++) {
//        if (cnt == 0) {
//          break;
//        } else if (!started && arr[i] == 2) {
//          started = true;
//          list.add(arr[i]);
//          cnt--;
//        }else if (started && arr[i] == 2) {
//          cnt--;
//          list.add(arr[i]);
//        } else if (started) {
//          list.add(arr[i]);
//        }
//      }
//      int[] answer = new int[list.size()];
//      for (int i = 0; i < answer.length; i++) {
//        answer[i] = list.get(i);
//      }
//      return answer;
//    }

//    2.
    int start = -1, end = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 2) {
        start = i;
        break;
      }
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == 2) {
        end = i;
        break;
      }
    }
    if (start == -1) {
      return new int[]{-1};
    }
    int[] answer = new int[end - start + 1];
    int pos = 0;
    for (int i = start; i <= end; i++) {
      answer[pos++] = arr[i];
    }
    return answer;
  }
}
