package programmers.greedy;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42840Test {

    private final Ex42840 ex = new Ex42840();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1}),
            Arguments.of(new int[]{1, 3, 2, 4, 2}, new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] answers, final int[] expected) {
        final int[] actual = ex.solution(answers);
        Assertions.assertThat(actual).containsExactly(expected);
    }

}