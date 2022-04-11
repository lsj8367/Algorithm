package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex81301Test {

    private Ex81301 ex = new Ex81301();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("one4seveneight", 1478),
            Arguments.of("23four5six7", 234567),
            Arguments.of("2three45sixseven", 234567),
            Arguments.of("123", 123)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(String s, final int expected) {
        final int actual = ex.solution(s);
        assertThat(actual).isEqualTo(expected);
    }

}