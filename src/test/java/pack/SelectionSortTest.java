package pack;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SelectionSortTest {

    SelectionSort ex = new SelectionSort();

    private static Stream<Arguments> test() {
        return Stream.of(
            Arguments.of(new int[]{5, 2, 3, 1, 4}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource
    void test(int[] arr, int n) {
        final int[] solution = ex.solution(arr, n);

        Assertions.assertThat(solution).isSorted();
    }

}