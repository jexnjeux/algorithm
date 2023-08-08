package programmers.level0;

import java.util.ArrayList;

public class P181868 {
  public String[] solution(String my_string) {
    String[] arr = my_string.split(" ");
    ArrayList<String> list = new ArrayList<>();

    for (String item: arr) {
      if (!item.equals("")) {
        list.add(item);
      }
    }
    return list.toArray(new String[0]);
  }

}
