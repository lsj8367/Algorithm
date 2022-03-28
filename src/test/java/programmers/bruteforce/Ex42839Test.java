package programmers.bruteforce;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42839Test {

    private final Ex42839 ex = new Ex42839();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("17", 3),
            Arguments.of("011", 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final String numbers, final int expected) {
        final int actual = ex.solution(numbers);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

}