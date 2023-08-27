package programmers.level1;

public class P133502 {

  public int solution(int[] ingredient) {
    int[] stack = new int[ingredient.length];
    int idx = 0;
    int answer = 0;
    for (int i : ingredient) {
      stack[idx++] = i;
      if (idx >= 4 && stack[idx - 1] == 1
          && stack[idx - 2] == 3
          && stack[idx - 3] == 2
          && stack[idx - 4] == 1) {
        idx -= 4;
        answer++;
      }
    }
    return answer;

    // int answer = 0;
    // Stack<Integer> stack = new Stack<>();
    // for (int i: ingredient) {
    //     stack.push(i);
    //     if (stack.size() >= 4) {
    //         if (stack.get(stack.size() - 1) == 1
    //            && stack.get(stack.size() - 2) == 3
    //            && stack.get(stack.size() - 3) == 2
    //            && stack.get(stack.size() - 4) == 1)  {
    //             answer++;
    //             stack.pop();
    //             stack.pop();
    //             stack.pop();
    //             stack.pop();
    //         }
    //     }
    // }
    // return answer;
  }

}
