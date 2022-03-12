package programmers.hash;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex42578Test {

    Ex42578 ex = new Ex42578();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}, 5),
            Arguments.of(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final String[][] clothes, final int expected) {
        final int actual = ex.solution(clothes);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}