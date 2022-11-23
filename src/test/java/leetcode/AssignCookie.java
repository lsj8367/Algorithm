package leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AssignCookie {

    @MethodSource
    @ParameterizedTest
    void solution(final int[] g, final int[] s, final int expected) {
        final int actual = findContentChildren(g, s);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3}, new int[]{1, 1}, 1),
            Arguments.of(new int[]{1, 2}, new int[]{1, 2, 3}, 2),
            Arguments.of(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}, 2)
        );
    }

    private int findContentChildren(final int[] g, final int[] s) {
        int result = 0;
        int i = 0;
        int j = 0;
        // g나 s가 내림차순으로 오는 때가 있음
        Arrays.sort(g);
        Arrays.sort(s);

        while (i <= g.length - 1 && j <= s.length - 1) {
            if (g[i] <= s[j]) {
                result++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return result;
    }

}
