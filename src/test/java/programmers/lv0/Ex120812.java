package programmers.lv0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex120812 {

    private int solution(int[] array) {

        int[] countArr = new int[1001];

        int max = 0;
        int count = 0;
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            countArr[array[i]]++;
        }

        for (int i = 0; i < countArr.length; i++) {
            if (max < countArr[i]) {
                max = countArr[i];
                result = i;
            }
        }

        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == max) {
                count++;
            }
        }

        if (count > 1) {
            return -1;
        }

        return result;
    }

    @Test
    void test() {
        final int actual = solution(new int[]{1, 2, 3, 3, 3, 4});
        final int actual2 = solution(new int[]{1, 1, 2, 2});
        final int actual3 = solution(new int[]{1});

        Assertions.assertThat(actual).isEqualTo(3);
        Assertions.assertThat(actual2).isEqualTo(-1);
        Assertions.assertThat(actual3).isEqualTo(1);
    }

}
