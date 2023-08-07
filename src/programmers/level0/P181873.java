package programmers.level0;

public class P181873 {

  public String solution(String my_string, String alp) {
    StringBuilder sb = new StringBuilder();
    char a = alp.charAt(0);
    for (char c : my_string.toCharArray()) {
      if (c == a) {
        sb.append((char) (c - 32));
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

}
