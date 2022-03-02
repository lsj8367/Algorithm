package programmers.lv1;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex87389Test {

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(10, 3),
            Arguments.of(12, 11)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int n, int result) {
        Ex87389 ex = new Ex87389();
        final int solution = ex.solution(n);
        Assertions.assertThat(solution).isEqualTo(result);
    }

}