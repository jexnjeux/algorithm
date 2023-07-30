package programmers.level0;


import java.util.ArrayList;

public class P181921 {

  public int[] solution(int l, int r) {

    ArrayList<Integer> list = new ArrayList<>();

//    1.
//    for (int i = l; i <= r; i++) {
//      if (String.valueOf(i).matches("[05]+")) {
//        list.add(i);
//      }
//    }

    for (int i = l; i <= r; i++) {

      int tmp = i;
      boolean flag = true;

      while (tmp > 0) {
        if (tmp % 10 != 0 && tmp % 10 != 5) {
          flag = false;
          break;
        }
        tmp = tmp / 10;
      }

      if (flag) {
        list.add(i);
      }
    }

    int[] answer;
    if (list.size() == 0) {
      answer = new int[]{-1};
    } else {
      answer = new int[list.size()];
      for (int i = 0; i < list.size(); i++) {
        answer[i] = list.get(i);
      }
    }
    return answer;
  }

}
