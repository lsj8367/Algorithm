package programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Ex12933Test {

    Ex12933 ex12933 = new Ex12933();

    @Test
    void solution() {
        assertThat(ex12933.solution(118372)).isEqualTo(873211);
    }

}
