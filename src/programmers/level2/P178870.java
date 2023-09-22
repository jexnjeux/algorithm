package programmers.level2;

public class P178870 {

  public int[] solution(int[] sequence, int k) {

    int left = 0, right = -1, sum = 0;
    int length = Integer.MAX_VALUE, answerL = -1, answerR = -1;

    while (right < sequence.length) {
      if (sum == k) {
        if (right - left < length) {
          length = right - left;
          answerL = left;
          answerR = right;
        }
        sum -= sequence[left++];
      } else if (sum > k) {
        sum -= sequence[left++];
      } else {
        if (++right < sequence.length) {
          sum += sequence[right];
        }
      }
    }
    return new int[] {answerL, answerR};


//    int[] answer = new int[]{0, sequence.length - 1};
//    int left = 0;
//    int sum = 0;
//
//    for (int right = 0; right < sequence.length; right++) {
//      sum += sequence[right];
//      if (sum == k && answer[1] - answer[0] > right - left) {
//        answer[1] = right;
//        answer[0] = left;
//      }
//      while (sum >= k) {
//        sum -= sequence[left++];
//        if (sum == k && (answer[1] - answer[0] > right - left)) {
//
//          answer[1] = right;
//          answer[0] = left;
//        }
//      }
//    }
//    return answer;
  }
}
