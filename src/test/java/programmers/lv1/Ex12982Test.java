package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex12982Test {

    private final Ex12982 ex = new Ex12982();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 3, 2, 5, 4}, 9, 3),
            Arguments.of(new int[]{2, 2, 3, 3}, 10, 4)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] d, int budget, final int expected) {
        final int actual = ex.solution(d, budget);
        assertThat(actual).isEqualTo(expected);
    }

}