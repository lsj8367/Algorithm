package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex68935Test {

    private final Ex68935 ex = new Ex68935();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(45, 7),
            Arguments.of(125, 229)

        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int number, final int expected) {
        final int actual = ex.solution(number);
        assertThat(actual).isEqualTo(expected);
    }

}