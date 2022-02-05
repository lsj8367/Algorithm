package programmers;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import programmers.lv1.Ex12943;

public class Ex12943Test {

    Ex12943 ex12943 = new Ex12943();

    @ParameterizedTest
    @MethodSource
    void solution(int num, int expected) {
        assertThat(ex12943.solution(num)).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(6, 8),
            Arguments.of(16, 4),
            Arguments.of(626331, -1)
        );
    }

}
