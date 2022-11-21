package leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class JumpGame2 {

    private int jump(final int[] nums) {

        int endIndex = 0;
        int result = 0;
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            //마지막인덱스는 끝에 도착이라 한번더 루프를 수행해선 안됨.
            endIndex = Math.max(i + nums[i], endIndex);

            if (i == max) {
                result++;
                max = endIndex;
            }

        }

        return result;
    }

    @Test
    void test() {
        assertThat(jump(new int[]{2, 3, 1, 1, 4})).isEqualTo(2);
        assertThat(jump(new int[]{2, 3, 0, 1, 4})).isEqualTo(2);
    }
}
