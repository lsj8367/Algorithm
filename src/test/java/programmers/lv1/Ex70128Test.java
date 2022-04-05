package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex70128Test {

    private final Ex70128 ex = new Ex70128();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}, 3),
            Arguments.of(new int[]{-1, 0, 1}, new int[]{1, 0, -1}, -2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] a, final int[] b, final int expected) {
        final int actual = ex.solution(a, b);
        assertThat(actual).isEqualTo(expected);
    }

}