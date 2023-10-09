package programmers.level2;

import java.util.Stack;

public class P131704 {

  public int solution(int[] order) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();

    for (int i = 1; i <= order.length; i++) {
      stack.push(i);

      while (!stack.isEmpty() && stack.peek() == order[answer]) {
        stack.pop();
        answer++;
      }
    }
    return answer;
  }

}
