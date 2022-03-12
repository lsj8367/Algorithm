package programmers.hash;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex42579Test {

    private final Ex42579 ex = new Ex42579();

    @Test
    void test() {
        final int[] solution = ex.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});

        Assertions.assertThat(solution).containsExactly(4, 1, 3, 0);
    }

}