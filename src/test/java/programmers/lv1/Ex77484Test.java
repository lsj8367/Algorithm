package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex77484Test {

    private final Ex77484 ex = new Ex77484();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}, new int[]{3, 5}),
            Arguments.of(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}, new int[]{1, 6}),
            Arguments.of(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}, new int[]{1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(int[] lottos, int[] win_nums, int[] expected) {
        final int[] actual = ex.solution(lottos, win_nums);
        assertThat(actual).containsExactly(expected);
    }

}