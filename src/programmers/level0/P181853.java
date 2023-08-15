package programmers.level0;

import java.util.Arrays;

public class P181853 {

  public int[] solution(int[] num_list) {
    Arrays.sort(num_list);
    return Arrays.copyOfRange(num_list, 0, 5);
  }


}
