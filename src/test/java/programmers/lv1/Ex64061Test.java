package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Ex64061Test {

    private final Ex64061 ex = new Ex64061();

    @Test
    void solution() {
        final int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        final int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        final int actual = ex.solution(board, moves);
        assertThat(actual).isEqualTo(4);
    }

}