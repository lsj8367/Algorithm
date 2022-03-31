package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex86491Test {

    private final Ex86491 ex = new Ex86491();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}, 4000),
            Arguments.of(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}, 120),
            Arguments.of(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}, 133)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[][] sizes, final int expected) {
        final int actual = ex.solution(sizes);
        assertThat(actual).isEqualTo(expected);
    }

}