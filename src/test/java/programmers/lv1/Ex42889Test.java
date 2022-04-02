package programmers.lv1;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42889Test {

    private final Ex42889 ex = new Ex42889();

    private static final Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}, new int[]{3, 4, 2, 1, 5}),
            Arguments.of(4, new int[]{4, 4, 4, 4, 4}, new int[]{4, 1, 2, 3}),
            Arguments.of(3, new int[]{1, 1, 1}, new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(int n, int[] stages, final int[] expected) {
        final int[] actual = ex.solution(n, stages);
        Assertions.assertThat(actual).containsExactly(expected);
    }

}