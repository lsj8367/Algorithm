package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex67256Test {

    private final Ex67256 ex = new Ex67256();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right", "LRLLLRLLRRL"),
            Arguments.of(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left", "LRLLRRLLLRR"),
            Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right", "LLRLLRLLRL")
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] numbers, final String hand, final String expected) {
        final String actual = ex.solution(numbers, hand);
        assertThat(actual).isEqualTo(expected);
    }

}