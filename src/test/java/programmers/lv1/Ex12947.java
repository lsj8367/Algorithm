package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class Ex12947 {
    public boolean solution(int x) {
        int sum = 0;
        int a = x;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }

        if (x % sum == 0) {
            return true;
        }

        return false;
    }

    @Test
    void test() {
        assertThat(solution(10)).isTrue();
        assertThat(solution(11)).isFalse();
        assertThat(solution(12)).isTrue();
        assertThat(solution(13)).isFalse();
        assertThat(solution(14)).isFalse();
        assertThat(solution(15)).isFalse();
    }
}
