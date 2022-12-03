package codeforce;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex1614Test {

    private final Ex1614 ex = new Ex1614();

    @ParameterizedTest
    @MethodSource
    void test(final int[] info, final int[] prices, final int expected) {
        final int actual = ex.solution(info, prices);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
            Arguments.of(new int[]{3, 1, 100, 100}, new int[]{50, 100, 50}, 2),
            Arguments.of(new int[]{6, 3, 5, 10}, new int[]{1, 2, 3, 4, 5, 6}, 2),
            Arguments.of(new int[]{6, 3, 5, 21}, new int[]{1, 2, 3, 4, 5, 6}, 3),
            Arguments.of(new int[]{10, 50, 69, 100}, new int[]{20, 30, 40, 77, 1, 1, 12, 4, 70, 10000}, 0),
            Arguments.of(new int[]{3, 50, 80, 30}, new int[]{20, 60, 70}, 0),
            Arguments.of(new int[]{10, 2, 7, 100}, new int[]{2, 2, 2, 2, 2, 5, 5, 5, 5, 5}, 10),
            Arguments.of(new int[]{4, 1000000000, 1000000000, 1000000000}, new int[]{1000000000, 1000000000, 1000000000, 1000000000}, 1),
            Arguments.of(new int[]{1, 1, 1, 1}, new int[]{1}, 1)
        );
    }
}
