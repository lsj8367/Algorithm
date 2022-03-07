package 인프런.ex7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex7_07 {

    static int[] distance = new int[]{-1, 1, 5};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        System.out.println(bfs(start, end));
    }

    private static int bfs(final int start, final int end) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[10001];
        q.offer(start);
        visited[start] = true;

        int count = 0;

        while (!q.isEmpty()) {
            int qSize = q.size();

            for (int i = 0; i < qSize; i++) {
                int value = q.poll();

                for (int n : distance) {
                    int newValue = value + n;

                    if (newValue == end) {
                        return ++count;
                    }

                    if (newValue >= 1 && newValue <= 10000 && !visited[newValue]) {
                        visited[newValue] = true;
                        q.offer(newValue);
                    }
                }

            }

            count++;
        }

        return count;
    }

}
