package programmers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ex12944Test {

    Ex12944 ex12944 = new Ex12944();

    @ParameterizedTest
    @MethodSource
    void solution(int[] arr, double expected) {
        assertThat(ex12944.solution(arr)).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 4}, 2.5),
            Arguments.of(new int[]{5, 5}, 5)
        );
    }

}
