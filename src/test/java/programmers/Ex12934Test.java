package programmers;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import programmers.lv1.정수제곱근판별;

public class Ex12934Test {
    정수제곱근판별 test = new 정수제곱근판별();

    @ParameterizedTest
    @MethodSource
    void solution(int n, int expected) {
        assertThat(test.solution(n)).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(121, 144),
            Arguments.of(3, -1)
        );
    }
}
