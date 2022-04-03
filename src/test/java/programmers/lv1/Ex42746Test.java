package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42746Test {

    private final Ex42746 ex = new Ex42746();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{6, 10, 2}, "6210"),
            Arguments.of(new int[]{3, 30, 34, 5, 9}, "9534330")
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int[] numbers, final String expected) {
        final String actual = ex.solution(numbers);
        assertThat(actual).isEqualTo(expected);
    }

}