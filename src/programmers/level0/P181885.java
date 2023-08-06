package programmers.level0;

import java.util.ArrayList;

public class P181885 {

  public String[] solution(String[] todo_list, boolean[] finished) {
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < todo_list.length; i++) {
      if (!finished[i]) {
        list.add(todo_list[i]);
      }
    }

    return list.toArray(new String[0]);
  }

}
