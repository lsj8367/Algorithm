package programmers.lv2;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex92335 {

    @ParameterizedTest
    @MethodSource
    void test(final int actual, final int expected) {
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
            Arguments.of(solution(437674, 3), 3),
            Arguments.of(solution(110011, 10), 2),
            Arguments.of(solution(1000001, 10), 0),
            Arguments.of(solution(2047, 2), 0),
            Arguments.of(solution(797161, 3), 0)
        );
    }

    private static int solution(int n, int k) {
        // n 은 숫자
        // k 는 진법
        final String s = Integer.toString(n, k);

        final String[] split = s.split("0");

        int count = 0;

        for (String num : split) {
            if ("".equals(num)) {
                continue;
            }

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

    private static boolean isPrime(long number) {
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
