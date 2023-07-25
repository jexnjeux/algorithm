package programmers.level0;

public class P181943 {
  public static String solution(String my_string, String overwrite_string, int s) {
    String result = my_string.substring(0, s);
    result += overwrite_string;
    result += my_string.substring(s + overwrite_string.length());
    return result;
  }


}
