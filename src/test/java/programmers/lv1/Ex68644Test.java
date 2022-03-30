package programmers.lv1;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex68644Test {

    private Ex68644 ex = new Ex68644();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{2, 1, 3, 4, 1}, new int[]{2, 3, 4, 5, 6, 7}),
            Arguments.of(new int[]{5, 0, 2, 7}, new int[]{2, 5, 7, 9, 12})
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] numbers, final int[] expected) {
        final int[] actual = ex.solution(numbers);
        Assertions.assertThat(actual).containsExactly(expected);
    }

}