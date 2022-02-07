package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex12910 {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        Collections.sort(list);

        return list.stream().mapToInt(i -> i).toArray();
    }

}