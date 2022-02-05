package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Ex12912Test {

    @Test
    void solution() {
        Ex12912 e = new Ex12912();

        assertThat(e.solution(3, 5)).isEqualTo(12);

    }

}