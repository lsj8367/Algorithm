package programmers.lv1;

import java.util.Arrays;

public class Ex12982 {

    public int solution(final int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];

            if (sum <= budget) {
                answer++;
            }

        }

        return answer;
    }

}
