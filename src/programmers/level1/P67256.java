package programmers.level1;

class P67256 {

  int[][] keypad = {
      {3, 1},
      {0, 0}, {0, 1}, {0, 2},
      {1, 0}, {1, 1}, {1, 2},
      {2, 0}, {2, 1}, {2, 2}};

  public String solution(int[] numbers, String hand) {
    String answer = "";
    StringBuilder sb = new StringBuilder();
    int[] left = {3, 0};
    int[] right = {3, 2};

    for (int number : numbers) {
      if (number % 3 == 1) {
        sb.append("L");
        left = keypad[number];
      } else if (number % 3 == 0 && number != 0) {
        sb.append("R");
        right = keypad[number];
      } else {
        String finger = getDistance(left, right, number, hand);
        if (finger.equals("R")) {
          sb.append("R");
          right = keypad[number];
        } else {
          sb.append("L");
          left = keypad[number];
        }
      }
    }

    answer = sb.toString();

    return answer;
  }

  public String getDistance(int[] left, int[] right, int number, String hand) {
    String finger = hand.equals("right") ? "R" : "L";

    int leftDis = Math.abs(left[0] - keypad[number][0]) + Math.abs(left[1] - keypad[number][1]);
    int rightDis = Math.abs(right[0] - keypad[number][0]) + Math.abs(right[1] - keypad[number][1]);

    if (leftDis > rightDis) {
      finger = "R";
    } else if (leftDis < rightDis) {
      finger = "L";
    }
    return finger;
  }

}