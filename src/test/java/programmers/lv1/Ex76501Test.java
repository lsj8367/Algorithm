package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex76501Test {

    private final Ex76501 ex = new Ex76501();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{4, 7, 12}, new boolean[]{true, false, true}, 9),
            Arguments.of(new int[]{1, 2, 3}, new boolean[]{false, false, true}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] absolutes, final boolean[] signs, final int expected) {
        final int actual = ex.solution(absolutes, signs);
        assertThat(actual).isEqualTo(expected);
    }

}