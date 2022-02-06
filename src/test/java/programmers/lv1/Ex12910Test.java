package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex12910Test {

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{5, 9, 7, 10}, 5, new int[]{5, 10}),
            Arguments.of(new int[]{2, 36, 1, 3}, 1, new int[]{1, 2, 3, 36}),
            Arguments.of(new int[]{3, 2, 6}, 10, new int[]{-1})
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int[] arr, int divisor, int... values) {
        Ex12910 e = new Ex12910();
        final int[] solution = e.solution(arr, divisor);

        assertThat(solution).containsExactly(values);
    }

}