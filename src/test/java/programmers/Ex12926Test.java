package programmers;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import programmers.lv1.Ex12926;

class Ex12926Test {

    private static Stream<Arguments> test() {
        return Stream.of(
            Arguments.of("AB", 1, "BC"),
            Arguments.of("z", 1, "a"),
            Arguments.of("a B z", 4, "e F d")
        );
    }

    @MethodSource
    @ParameterizedTest
    void test(String actual, int number, String expected) {
        Ex12926 ex = new Ex12926();
        assertThat(ex.solution(actual, number)).isEqualTo(expected);
    }

}