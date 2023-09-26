package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11725 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    ArrayList<Integer>[] graph = new ArrayList[n + 1];
    for (int i = 1; i <= n; i++) {
      graph[i] = new ArrayList<>();
    }
    for (int i = 1; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      graph[x].add(y);
      graph[y].add(x);
    }

    boolean[] visited = new boolean[n + 1];
    ArrayList<Integer> queue = new ArrayList<>();
    queue.add(1);
    visited[1] = true;

    int[] answer = new int[n + 1];

    while (!queue.isEmpty()) {
      int idx = queue.remove(0);
      for (int next : graph[idx]) {
        if (!visited[next]) {
          queue.add(next);
          visited[next] = true;
          answer[next] = idx;
        }
      }
    }

    for (int i = 2; i <= n; i++) {
      System.out.println(answer[i]);
    }

  }

}
