package programmers.greedy;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42883 {

    @ParameterizedTest
    @MethodSource
    void test(final String number, final int k, final String expected) {
        assertThat(solution(number, k)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
            Arguments.of("1924", 2, "94"),
            Arguments.of("1231234", 3, "3234"),
            Arguments.of("4177252841", 4, "775841")
        );
    }

    private String solution(final String number, final int k) {
        final StringBuilder sb = new StringBuilder();
        int index = 0;

        // 총 만들어야 하는 자리수 만큼 for-loop
        for (int i = 0; i < number.length() - k; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = index; j <= k + i; j++) {
                // 해당 자릿수 값
                final int value = number.charAt(j) - '0';
                if (max < value) {
                    max = value;
                    // max값으로 설정된 변수의 다음 index부터 시작해야 되서 1 더해줌
                    index = j + 1;
                }
            }

            sb.append(max);
        }


        return sb.toString();
    }
}
