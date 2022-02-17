package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex17681Test {

    private static Stream<Arguments> test() {
        return Stream.of(
//            Arguments.of(
//                5,
//                new int[]{9, 20, 28, 18, 11},
//                new int[]{30, 1, 21, 17, 28},
//                new String[]{"#####", "# # #", "### #", "#  ##", "#####"}
//            ),
            Arguments.of(
                6,
                new int[]{46, 33, 33, 22, 31, 50},
                new int[]{27, 56, 19, 14, 14, 10},
                new String[]{"######", "### #", "## ##", " #### ", " #####", "### # "}
            )
        );
    }

    @ParameterizedTest
    @MethodSource
    void test(int n, int[] arr1, int[] arr2, String[] result) {
        Ex17681 ex = new Ex17681();
        final String[] solution = ex.solution(n, arr1, arr2);
        assertThat(solution).containsExactly(result);
    }

}