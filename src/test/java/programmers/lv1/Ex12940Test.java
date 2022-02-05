package programmers.lv1;

// 최대공약수, 최소공배수

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ex12940Test {

    Ex12940 ex12940 = new Ex12940();



    @ParameterizedTest
    @MethodSource
    void solution(int n, int m, int[] expected) {
        assertThat(ex12940.solution(n, m)).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(3, 12, new int[]{3, 12}),
            Arguments.of(2, 5, new int[]{1, 10})
        );
    }

}
