package 인프런.ex7;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Ex7_02Test {

    @Test
    void test() {
        Ex7_02 ex = new Ex7_02();
        final String solution = ex.solution(11);

        assertThat(solution).isEqualTo("1011");
    }

}