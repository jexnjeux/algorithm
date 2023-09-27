package baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2003 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int left = 0;
    int sum = 0;
    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int answer = 0;

    for (int right = 0; right < N; right++) {
      sum += arr[right];
      if (sum == M) {
        answer++;
        sum -= arr[left++];
      } else if (sum > M) {
        while (sum > M) {
          sum -= arr[left++];
        }
        if (sum == M) {
          answer++;
          sum -= arr[left++];
        }
      }
    }
    System.out.println(answer);
  }

}
