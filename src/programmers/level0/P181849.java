package programmers.level0;

public class P181849 {

  public int solution(String num_str) {
    int answer = 0;
    char[] num_char = num_str.toCharArray();
    for (char c : num_char) {
      answer += (c - '0');
//      answer += Character.getNumericValue(c);
    }
    return answer;
  }

}
