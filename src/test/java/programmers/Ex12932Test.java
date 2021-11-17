package programmers;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ex12932Test {

    Ex12932 ex12932 = new Ex12932();

    @ParameterizedTest
    @MethodSource
    void solution(long n, int[] expected) {
        Assertions.assertThat(ex12932.solution(n)).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(12345, new int[]{5,4,3,2,1})
        );
    }


}
