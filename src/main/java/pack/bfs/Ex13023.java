package pack.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex13023 {
    private static boolean[] visited;
    private static List<Integer>[] list;
    private static boolean arrived;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        list = new ArrayList[n];
        visited = new boolean[n];
        arrived = false;

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (arrived) {
                break;
            }
        }

        if (arrived) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void dfs(final int now, final int depth) {
        if (depth == 5 || arrived) {
            arrived = true;
            return;
        }

        visited[now] = true;
        for (int i : list[now]) {
            if (!visited[i]) {
                dfs(i, depth + 1);
            }
        }
        visited[now] = false;
    }

}
