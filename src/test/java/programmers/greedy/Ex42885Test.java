package programmers.greedy;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@TestInstance(Lifecycle.PER_CLASS)
class Ex42885Test {

    private final Ex42885 ex = new Ex42885();

    @MethodSource
    @ParameterizedTest
    void solutionTest(final int[] arr, final int limit, final int expected) {
        assertThat(ex.solution(arr, limit)).isEqualTo(expected);
    }

    private Stream<Arguments> solutionTest() {
        return Stream.of(
            Arguments.of(new int[]{70, 50, 80, 50}, 100, 3),
            Arguments.of(new int[]{70, 80, 50}, 100, 3),
            Arguments.of(new int[]{50, 50, 50}, 100, 2)
        );
    }

}
