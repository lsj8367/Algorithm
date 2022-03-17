package programmers.stack;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42583Test {

    private final Ex42583 ex = new Ex42583();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(2, 10, new int[]{7, 4, 5, 6}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(int bridgeLength, int weight, int[] truckWeights, int expected) {
        final int actual = ex.solution(bridgeLength, weight, truckWeights);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}