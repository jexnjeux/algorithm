package baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1253 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Long[] arr = new Long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        int answer = 0;

        for (int i = 0; i < N; i++) {

            int left = 0;
            int right = N - 1;

            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) {
                    if (left != i && right != i) {
                        answer++;
                        break;
                    } else if (left == i) {
                        left++;
                    } else {
                        right--;
                    }
                } else if (arr[left] + arr[right] > arr[i]) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.println(answer);
    }

}
