package programmers.lv0;

import org.junit.jupiter.api.Test;

import java.util.*;

class Solution {
    int[] dx = new int[]{0, 1, 0, -1};
    int[] dy = new int[]{1, 0, -1, 0};
    boolean[][] visited;

    public int solution(String[] storage, String[] requests) {
        String[][] map = new String[storage.length][storage[0].length()];

        for (int i = 0; i < storage.length; i++) {
            String[] chars = storage[i].split("");
            for (int j = 0; j < chars.length; j++) {
                map[i][j] = chars[j];
            }
        }

        int row = map.length;
        int col = map[0].length;
        // 단어 길이가 1개이면 dfs
        for (int i = 0; i < requests.length; i++) {
            visited = new boolean[row][col];

            if (requests[i].length() == 1) {
                for (int r = 0; r < row; r++) {
                    dfs(r, 0, map, requests[i]);
                    dfs(r, col - 1, map, requests[i]);
                }
                // 열 순회 → 위쪽, 아래쪽 가장자리
                for (int c = 0; c < col; c++) {
                    dfs(0, c, map, requests[i]);
                    dfs(row - 1, c, map, requests[i]);
                }
            } else {
                String container = requests[i].substring(0, 1);
                for (int x = 0; x < map.length; x++) {
                    for (int y = 0; y < map[0].length; y++) {
                        if (map[x][y].equals(container)) {
                            map[x][y] = "";
                        }
                    }
                }
            }

        }

        // 단어 길이가 2개면 완전탐색
        int answer = 0;
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[0].length; y++) {
                if (!map[x][y].equals("")) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private void dfs(int x, int y, String[][] map, String container) {
        visited[x][y] = true;
        if (map[x][y].equals("")) {
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (0 <= newX && newX < map.length && 0 <= newY && newY < map[0].length
                        && !visited[newX][newY]) {
                    dfs(newX, newY, map, container);
                }
            }
        }
        if (map[x][y].equals(container)) {
            map[x][y] = "";
        }
    }

    @Test
    void tets() {
        Solution solution = new Solution();
        solution.solution(new String[]{"AZWQY", "CAABX", "BBDDA", "ACACA"}, new String[]{"A", "BB", "A"});
    }
}