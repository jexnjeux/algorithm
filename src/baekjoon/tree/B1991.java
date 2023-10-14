package baekjoon.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class B1991 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Map<String, ArrayList<String>> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String root = st.nextToken();
      String left = st.nextToken();
      String right = st.nextToken();
      ArrayList<String> child = new ArrayList<>();
      child.add(left);
      child.add(right);
      map.put(root, child);

    }
    preOrder(map, "A");
    System.out.println();
    inOrder(map, "A");
    System.out.println();
    postOrder(map, "A");


  }

  public static void preOrder(Map<String, ArrayList<String>> map, String root) {
    if (!root.equals(".")) {
      System.out.print(root);
      preOrder(map, map.get(root).get(0));
      preOrder(map, map.get(root).get(1));
    }
  }

  public static void inOrder(Map<String, ArrayList<String>> map, String root) {
    if (!root.equals(".")) {
      inOrder(map, map.get(root).get(0));
      System.out.print(root);
      inOrder(map, map.get(root).get(1));
    }
  }

  public static void postOrder(Map<String, ArrayList<String>> map, String root) {
    if (!root.equals(".")) {
      postOrder(map, map.get(root).get(0));
      postOrder(map, map.get(root).get(1));
      System.out.print(root);
    }

  }
}

