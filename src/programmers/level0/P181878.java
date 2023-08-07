package programmers.level0;

public class P181878 {

  public int solution(String myString, String pat) {
    myString = myString.toUpperCase();
    pat = pat.toUpperCase();

    if (myString.indexOf(pat) >= 0) {
      return 1;
    }

//    if (myString.contains(pat)) {
//      return 1;
//    }
    return 0;
  }
}
