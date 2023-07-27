package programmers.level0;

public class P181928 {

  public int solution(int[] num_list) {
    int answer = 0;
    StringBuilder odd = new StringBuilder();
    StringBuilder even = new StringBuilder();
    for (int num: num_list) {
      if (num % 2 == 1) {
        odd.append(num + "");
      } else {
        even.append(num + "");
      }
    }
    answer = Integer.parseInt(String.valueOf(odd)) + Integer.parseInt(String.valueOf(even));
    return answer;
  }

  public int solution2(int[] num_list) {
    int answer = 0;
    int odd = 0;
    int even = 0;

    for (int num: num_list) {
      if (num % 2 == 1) {
        odd *= 10;
        odd += num;
      } else {
        even *= 10;
        even += num;
      }
    }
    answer = odd + even;
    return answer;
  }
}
