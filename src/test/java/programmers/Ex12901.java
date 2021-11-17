package programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// 2016년
public class Ex12901 {

    public String solution(int a, int b) {
        String[] days = new String[366];
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int findDay = 0;

        for (int i = 0; i < days.length; i++) {
            days[i] = week[(i + 5) % 7];
        }

        for (int i = 0; i < a - 1; i++) {
            findDay += month[i];
        }

        findDay += b;

        return days[findDay - 1]; // 시작하자마자 하루 지난것 빼줌
    }

    @Test
    void 테스트1() {
        assertThat(solution(5, 24)).isEqualTo("TUE");
    }


}
