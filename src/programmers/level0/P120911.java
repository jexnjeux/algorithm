package programmers.level0;

import java.util.Arrays;

public class P120911 {
  public String solution(String my_string) {
    char[] arr = my_string.toLowerCase().toCharArray();

    Arrays.sort(arr);

    return String.valueOf(arr);
  }

}
