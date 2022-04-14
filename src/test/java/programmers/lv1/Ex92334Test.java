package programmers.lv1;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex92334Test {

    private final Ex92334 ex = new Ex92334();

    @ParameterizedTest
    @MethodSource
    void solution(final String[] id_list, final String[] report, final int k, final int[] expected) {
        final int[] actual = ex.solution(id_list, report, k);
        Assertions.assertThat(actual).containsExactly(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},
                2, new int[]{2, 1, 1, 0}),
            Arguments.of(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                3, new int[]{0, 0})
        );
    }
}