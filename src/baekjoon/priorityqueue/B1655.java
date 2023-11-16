package baekjoon.priorityqueue;

import java.util.*;
import java.io.*;

public class B1655 {

    public static void main(String[] args) throws IOException {
        // Scanner를 사용했더니 시간초과
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 우선순위 큐 하나로 하면 이중 for문이 필요해서 시간초과
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (minHeap.size() == maxHeap.size()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            if (!minHeap.isEmpty() && !maxHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                int minHeapRoot = minHeap.poll();
                int maxHeapRoot = maxHeap.poll();
                minHeap.offer(maxHeapRoot);
                maxHeap.offer(minHeapRoot);
            }
            sb.append(maxHeap.peek() + "\n");
        }
        System.out.println(sb.toString());
    }
}
