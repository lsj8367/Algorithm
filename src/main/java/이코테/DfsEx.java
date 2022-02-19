package 이코테;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DfsEx {

    private static boolean[] visited = new boolean[9];

    private static List<List<Integer>> graph = new ArrayList<>();

    private static void dfs(int index) {
        visited[index] = true; //방문처리
        System.out.print(index + " "); //방문처리한 인덱스 출력

        for (int i = 0; i < graph.get(index).size(); i++) { //해당 노드의 하위 노드
            int y = graph.get(index).get(i);
            if (!visited[y]) {
                dfs(y);
            }

        }
    }

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);

        dfs(1);
    }

}

