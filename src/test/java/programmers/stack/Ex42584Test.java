package programmers.stack;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42584Test {

    private final Ex42584 ex = new Ex42584();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 2, 3}, new int[]{4, 3, 1, 1, 0})
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(int[] prices, int[] expected) {
        final int[] actual = ex.solution(prices);
        Assertions.assertThat(actual).containsExactly(expected);
    }

}