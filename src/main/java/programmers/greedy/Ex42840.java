package programmers.greedy;

import java.util.ArrayList;
import java.util.List;

public class Ex42840 {

    //1번 1, 2, 3, 4, 5
    //2번 2, 1, 2, 3, 2, 4, 2, 5
    //3번 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
    private final int[] arr1 = new int[]{1, 2, 3, 4, 5};
    private final int[] arr2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    private final int[] arr3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int value = answers[i];

            if (value == arr1[i % arr1.length]) {
                count[0]++;
            }

            if (value == arr2[i % arr2.length]) {
                count[1]++;
            }

            if (value == arr3[i % arr3.length]) {
                count[2]++;
            }

        }

        int maxPoint = 0;

        for (int value : count) {
            if (maxPoint < value) {
                maxPoint = value;
            }

        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < count.length; i++) {

            if (maxPoint == count[i]) {
                list.add(i + 1);
            }

        }

        return list.stream().mapToInt(answer -> answer)
            .toArray();
    }

}
