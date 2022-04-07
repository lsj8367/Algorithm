package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex86051Test {

    private final Ex86051 ex = new Ex86051();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 4, 6, 7, 8, 0}, 14),
            Arguments.of(new int[]{5, 8, 4, 0, 6, 7, 9}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] numbers, final int expected) {
        final int actual = ex.solution(numbers);
        assertThat(actual).isEqualTo(expected);
    }

}