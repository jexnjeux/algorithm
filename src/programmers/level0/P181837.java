package programmers.level0;

public class P181837 {

  public int solution(String[] order) {
    int answer = 0;
    for (String o : order) {
      if (o.contains("latte")) {
        answer += 5000;
      } else {
        answer += 4500;
      }
    }
    return answer;
  }

}