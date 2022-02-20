package programmers.lv1;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex82612Test {

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(3, 20, 4, 10)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(final int price, final int money, final int count, final int result) {
        //given
        Ex82612 ex = new Ex82612();
        //when
        final long actual = ex.solution(price, money, count);
        //then
        Assertions.assertThat(actual).isEqualTo(result);
    }

}