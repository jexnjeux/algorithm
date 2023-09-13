package programmers.level1;

public class P42862 {

  public int solution(int n, int[] lost, int[] reserve) {
    int answer = n;
    int[] arr = new int[n];

    for (int l : lost) {
      arr[l - 1]--;
    }

    for (int r : reserve) {
      arr[r - 1]++;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        if (i >= 1 && arr[i - 1] == 1) {
          arr[i]++;
          arr[i - 1]--;
        } else if (i < arr.length - 1 && arr[i + 1] == 1) {
          arr[i]++;
          arr[i + 1]--;
        } else {
          answer--;
        }
      }
    }
    return answer;

//         int answer = n - lost.length;

//         Arrays.sort(lost);
//         Arrays.sort(reserve);

//         for (int i = 0; i < reserve.length; i++) {
//             for (int j = 0; j < lost.length; j++) {
//                 if (reserve[i] == lost[j]) {
//                     reserve[i] = -1;
//                     lost[j] = -1;
//                     answer++;
//                     break;
//                 }
//             }
//         }

//         for (int i = 0; i < reserve.length; i++) {
//             for (int j = 0; j < lost.length; j++) {
//                 if (reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]) {
//                     answer++;
//                     reserve[i] = -1;
//                     lost[j] = -1;
//                     break;
//                 }
//             }
//         }
//         return answer;
  }

}
