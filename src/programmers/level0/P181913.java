package programmers.level0;

public class P181913 {
//  1.
//  static StringBuilder reverse(StringBuilder s, int l, int r) {
//    StringBuilder t = new StringBuilder(s.substring(l, r + 1));
//    t.reverse();
//    s.replace(l, r + 1, t.toString());
//    return s;
//  }
//
//  public String solution(String my_string, int[][] queries) {
//    StringBuilder answer = new StringBuilder(my_string);
//    for (int[] q : queries) answer = reverse(answer, q[0], q[1]);
//    return answer.toString();
//  }

  //  2.
  public String solution(String my_string, int[][] queries) {
    char[] arr = my_string.toCharArray();
    for (int[] x : queries) {
      int left = x[0];
      int right = x[1];
      while (left < right) {
        char tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
        left++;
        right--;
      }
    }
    return String.valueOf(arr);
  }

}
