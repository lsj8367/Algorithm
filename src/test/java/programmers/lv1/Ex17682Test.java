package programmers.lv1;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex17682Test {


    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("1S2D*3T", 37),
            Arguments.of("1D2S#10S", 9),
            Arguments.of("1D2S0T", 3),
            Arguments.of("1S*2T*3S", 23),
            Arguments.of("1D#2S*3S", 5),
            Arguments.of("1T2D3D#", -4),
            Arguments.of("1D2S3T*", 59)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(String dartResult, int expected) {
        Ex17682 e = new Ex17682();
        final int solution = e.solution(dartResult);
        Assertions.assertThat(solution).isEqualTo(expected);
    }

}