package programmers.level0;

public class P120904 {

  public int solution(int num, int k) {
    String sNum = String.valueOf(num);
    String sK = String.valueOf(k);

    return sNum.indexOf(sK) != -1 ? sNum.indexOf(sK) + 1 : -1;

//    for (int i = 0; i < sNum.length(); i++) {
//      if (sNum.charAt(i) == (char) (k + '0')) {
//        answer = i + 1;
//        break;
//      }
//    }
//    return answer;
  }

}
