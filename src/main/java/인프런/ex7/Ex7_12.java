package 인프런.ex7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex7_12 {

    private static int target = 0;
    private static boolean[] visit;
    private static int result = 0;
    private static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        target = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new boolean[target + 1][target + 1];

        visit = new boolean[target + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = true;
        }

        visit[1] = true;
        dfs(1);
        System.out.println(result);
    }


    private static void dfs(final int v) {

        if (v == target) {
            result++;
        } else {
            for (int i = 1; i <= target; i++) {
                if (arr[v][i] && !visit[i]) {
                    visit[i] = true;
                    dfs(i);
                    //앞선 경우에서는 이미 해결이 되었으므로 다른 경로를 추적해야 하니까 false로 바꾼다.
                    visit[i] = false;
                }
            }
        }
    }
}
