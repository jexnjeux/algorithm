package programmers.level0;

public class P181923 {

  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      int num = Integer.MAX_VALUE;
      int s = queries[i][0];
      int e = queries[i][1];
      int k = queries[i][2];
      for (int j = s; j <= e; j++) {
        if (arr[j] > k && arr[j] < num) {
          num = arr[j];
        }
      }
      answer[i] = num == Integer.MAX_VALUE ? -1 : num;

    }
    return answer;
  }

}
