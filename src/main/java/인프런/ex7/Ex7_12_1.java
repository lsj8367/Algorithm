package 인프런.ex7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex7_12_1 {

    static boolean[] visited;
    static List<List<Integer>> graph;
    static int n;
    static int m;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 정점 갯수
        m = Integer.parseInt(st.nextToken()); // 간선 수

        answer = 0;
        visited = new boolean[n + 1];
        graph = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            // 그래프 초기화
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            graph.get(s).add(t);
        }

        visited[1] = true;

        dfs(1);
        System.out.println(answer);
    }

    private static void dfs(final int value) {
        if (n == value) {
            answer++;
            return;
        }

        for (Integer nextvalue : graph.get(value)) {
            if (!visited[nextvalue]) {
                visited[nextvalue] = true;
                dfs(nextvalue);
                visited[nextvalue] = false;
            }
        }
    }

}
