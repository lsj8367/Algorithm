package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42748Test {

    private final Ex42748 ex = new Ex42748();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}, new int[]{5, 6, 3}
            )
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] array, final int[][] commands, final int[] expected) {
        final int[] actual = ex.solution(array, commands);
        assertThat(actual).containsExactly(expected);
    }


}