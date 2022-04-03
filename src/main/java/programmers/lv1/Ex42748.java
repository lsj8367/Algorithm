package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex42748 {

    public int[] solution(final int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            final List<Integer> list = new ArrayList<>();
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int index = commands[i][2] - 1;

            for (int j = start; j <= end; j++) {
                list.add(array[j]);
            }

            Collections.sort(list);

            if (i < commands.length) {
                answer[i] = list.get(index);
            }
        }

        return answer;
    }

}
