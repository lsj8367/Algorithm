package testdome;

import java.util.HashMap;
import java.util.Map;

public class PaperStrip {

    private static boolean[] visited;
    private static Map<Integer, Integer> arrayToMap = new HashMap<>();

    public static int minPieces(int[] original, int[] desired) {
        if (original.length == 0 || desired.length == 0) {
            return 0;
        }
        for (int i = 0; i < original.length; i++) {
            arrayToMap.put(original[i], i);
        }

        visited = new boolean[original.length];
        int result = 0;

        for (int i = 0; i < original.length; i++) {
            if (!visited[i]) {
                int count = dfs(desired, i);
                result += count - 1; // 정렬이 된건 2회인데 true 바꾼게 3회라 -1
            }
        }
        return result;
    }

    private static int dfs(int[] desired, int current) {
        int count = 0;
        while (!visited[current]) {
            visited[current] = true;
            count++;

            final int location = desired[current];
            if (arrayToMap.get(location) == null) {
                return 0;
            }
            current = arrayToMap.get(location);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] original = new int[] {1, 4, 3, 2, 5, 8, 7, 6};
        int[] desired = new int[] {1, 2, 4, 3, 5, 6, 7, 8};
        System.out.println(PaperStrip.minPieces(original, desired));
    }
}
