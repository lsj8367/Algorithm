package programmers.lv0;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex120813 {

    @Test
    void test() {
        final int[] solution = solution(10);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    private int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int index = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 1) {
                list.add(index, i);
                index++;
            }
        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}
