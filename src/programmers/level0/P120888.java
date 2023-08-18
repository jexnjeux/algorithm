package programmers.level0;

public class P120888 {

  public String solution(String my_string) {
    String answer = "";
    for (char c : my_string.toCharArray()) {
      if (answer.indexOf(c) == -1) {
        answer += c;
      }
    }
    return answer;
  }

}
