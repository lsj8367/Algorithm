package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex12977Test {

    private final Ex12977 ex = new Ex12977();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 4}, 1),
            Arguments.of(new int[]{1, 2, 7, 6, 4}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] nums, final int expected) {
        final int actual = ex.solution(nums);
        assertThat(actual).isEqualTo(expected);
    }

}