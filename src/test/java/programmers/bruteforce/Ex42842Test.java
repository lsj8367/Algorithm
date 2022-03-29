package programmers.bruteforce;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42842Test {

    private final Ex42842 ex = new Ex42842();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(10, 2, new int[]{4, 3}),
            Arguments.of(8, 1, new int[]{3, 3}),
            Arguments.of(24, 24, new int[]{8, 6})
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int brown, final int yellow, final int[] expected) {
        final int[] actual = ex.solution(brown, yellow);
        Assertions.assertThat(actual).containsExactly(expected);
    }

}