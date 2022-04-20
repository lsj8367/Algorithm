package programmers.lv2;

import static org.junit.jupiter.api.Assertions.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex12953Test {

    @Test
    void test() {
        Ex12953 ex = new Ex12953();
        final int actual = ex.solution(new int[]{2, 6, 8, 14});
        Assertions.assertThat(actual).isEqualTo(168);
    }

}