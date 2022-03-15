package programmers.stack;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42587Test {

    private final Ex42587 ex = new Ex42587();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{2, 1, 3, 2}, 2, 1),
            Arguments.of(new int[]{1, 1, 9, 1, 1, 1}, 0, 5)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(int[] priorities, int location, int expected) {
        final int actual = ex.solution(priorities, location);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}