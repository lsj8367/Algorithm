package programmers.lv1;

import java.util.Set;
import java.util.TreeSet;

public class Ex68644 {

    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(value -> value).toArray();
    }

}
