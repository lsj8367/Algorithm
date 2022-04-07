package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class Ex86051 {

    Map<Integer, Integer> map = new HashMap<>();

    public int solution(final int[] numbers) {

        int max = 45;

        for (int i = 0; i < numbers.length; i++) {
            max -= numbers[i];
        }

        return max;
    }

}
