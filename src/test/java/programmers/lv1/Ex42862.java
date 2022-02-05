package programmers.lv1;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Ex42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        //n: 사람수
        //lost: 체육복 없는 사람
        //reserve: 체육복 남는 사람
        int total = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int count = 0;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    count++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
                    count++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return total + count;
    }

    @Test
    void 예제_1() {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        assertThat(solution(5, lost, reserve)).isEqualTo(5);
    }

    @Test
    void 예제_2() {
        int[] lost = {2, 4};
        int[] reserve = {3};
        assertThat(solution(5, lost, reserve)).isEqualTo(4);
    }

    @Test
    void 예제_3() {
        int[] lost = {3};
        int[] reserve = {1};
        assertThat(solution(3, lost, reserve)).isEqualTo(2);
    }

    @Test
    void 예제_4() {
        int[] lost = {1, 2};
        int[] reserve = {1, 2};
        assertThat(solution(3, lost, reserve)).isEqualTo(3);
    }

    @Test
    void 실패했던_케이스() {
        int[] lost = {4, 2};
        int[] reserve = {3, 5};
        assertThat(solution(5, lost, reserve)).isEqualTo(5);
    }

}
