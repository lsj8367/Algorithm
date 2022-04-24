package programmers.sort;

import java.util.Arrays;

public class Ex42747 {
    public int solution(final int[] citations) {
        int answer = 0;
        int n = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < n; i++) {
            int h = n - i;

            if (citations[i] >= h) {
                answer = h;
                return answer;
            }
        }


        return answer;
    }
}
