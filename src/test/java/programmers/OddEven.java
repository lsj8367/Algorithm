package programmers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class OddEven {

    OddEvenChecker oddEvenChecker = new OddEvenChecker();

    @ParameterizedTest
    @MethodSource
    void solution(int num, String expected) {
        assertThat(oddEvenChecker.solution(num)).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(5, "Odd"),
            Arguments.of(6, "Even")
        );
    }

}
