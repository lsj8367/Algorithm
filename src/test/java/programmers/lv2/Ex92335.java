package programmers.lv2;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class Ex92335 {

    @Test
    void test() {
        assertThat(solution(437674, 3)).isEqualTo(3);
        assertThat(solution(110011, 10)).isEqualTo(2);
        assertThat(solution(1000001, 10)).isEqualTo(0);
        assertThat(solution(2047, 2)).isEqualTo(0);
        assertThat(solution(797161, 3)).isEqualTo(0);
    }

    public int solution(int n, int k) {
        // n 은 숫자
        // k 는 진법
        final String s = Integer.toString(n, k);

        final String[] split = s.split("0");

        int count = 0;

        for (String num : split) {
            if ("".equals(num)) {
                continue;
            }
            System.out.println(num);

            if (isPrime(Long.parseLong(num))) {
                count++;
            }
//            if (isPrime(Integer.parseInt(num))) {
//                count++;
//            }
        }

        return count;
    }

//    private boolean isPrime(int number) {
//        if (number < 2) {
//            return false;
//        }
//
//        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    private boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
