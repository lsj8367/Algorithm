package programmers.sort;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Ex42747Test {

    @Test
    void solution() {
        Ex42747 ex = new Ex42747();
        final int actual = ex.solution(new int[]{3, 0, 6, 1, 5});
        assertThat(actual).isEqualTo(3);
    }
}