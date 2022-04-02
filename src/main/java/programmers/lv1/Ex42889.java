package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex42889 {

    public int[] solution(final int n, int[] stages) {

        List<Node> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }

        for (int stage : stages) {
            if (n < stage) {
                continue;
            }

            map.put(stage, map.get(stage) + 1);
        }

        int cnt = stages.length;

        for (int i = 1; i <= n; i++) {
            int under = cnt;
            int up = map.get(i);

            list.add(new Node(i, up == 0 ? 0.00 : up / (double) under));
            cnt -= map.get(i);
        }

        Collections.sort(list);

        return list.stream().mapToInt(l -> l.index)
            .toArray();
    }

    private static class Node implements Comparable<Node> {

        private int index;
        private double value;

        public Node(final int index, final double value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(final Node o) {
            if (this.value > o.value) {
                return -1;
            }
            if (this.value == o.value) {
                return 0;
            }
            return 1;
        }

    }

}
