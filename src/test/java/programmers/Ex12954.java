package programmers;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Ex12954 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long index = x;

        for(int i = 0; i < n; i++) {
            answer[i] = index * (i + 1);
        }

        return answer;
    }


    @Test
    void test1() {
        Arrays.stream(solution(2, 5)).forEach(System.out::print);
    }

    @Test
    void test2() {
        Arrays.stream(solution(4, 3)).forEach(System.out::print);
    }

    @Test
    void test3() {
        Arrays.stream(solution(-4, 2)).forEach(System.out::print);
    }
}
