package programmers.dfsbfs;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex43162Test {

    @MethodSource
    @ParameterizedTest
    void test(final int n, final int[][] computers, final int expected) {
        Ex43162 ex43162 = new Ex43162();
        final int solution = ex43162.solution(n, computers);
        Assertions.assertThat(solution).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
            Arguments.of(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}, 2)
        );
    }

}
