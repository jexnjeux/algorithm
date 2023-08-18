package programmers.level0;

import java.util.Arrays;

public class P120890 {

  public int solution(int[] array, int n) {
    int answer = 0;
    int gap = Integer.MAX_VALUE;
//         for (int item: array) {
//             if (Math.abs(item - n) < gap) {
//                 answer = item;
//                 gap = Math.abs(item - n);
//             } else if (Math.abs(item - n) == gap && item < answer) {
//                 answer = item;
//             }

//         }

    Arrays.sort(array);
    for (int item : array) {
      if (Math.abs(item - n) < gap) {
        answer = item;
        gap = Math.abs(item - n);
      }
    }
    return answer;
  }

}
