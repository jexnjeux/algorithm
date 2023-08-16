package programmers.level0;

public class P120907 {

  public String[] solution(String[] quiz) {
    String[] answer = new String[quiz.length];

    for (int i = 0; i < quiz.length; i++) {
      String[] arr = quiz[i].split(" ");
      int num1 = Integer.parseInt(arr[0]);
      int num2 = Integer.parseInt(arr[2]);
      int sum = Integer.parseInt(arr[4]);

      String operator = arr[1];

      int calculatedSum = num1 + num2 * (operator.equals("-") ? -1 : 1);

      if (sum == calculatedSum) {
        answer[i] = "O";
      } else {
        answer[i] = "X";
      }
    }
    return answer;
  }

}
