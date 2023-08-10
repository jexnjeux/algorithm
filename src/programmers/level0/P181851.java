package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P181851 {

  public int solution(int[] rank, boolean[] attendance) {
    ArrayList<int[]> list = new ArrayList<>();
    for (int i = 0; i < attendance.length; i++) {
      if (attendance[i]) {
        int[] arr = new int[]{rank[i], i};
        list.add(arr);
      }
    }

    list.sort((a, b) -> (a[0] - b[0]));
    return 10000 * list.get(0)[1] + 100 * list.get(1)[1] + list.get(2)[1];
  }

}
