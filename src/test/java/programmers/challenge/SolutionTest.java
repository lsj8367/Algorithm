package programmers.challenge;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        int solution1 = solution.solution(
                new int[]{730, 855, 700, 720},
                new int[][]{
                        new int[]{710, 700, 650, 735, 700, 931, 912},
                        new int[]{908, 901, 805, 815, 800, 831, 835},
                        new int[]{705, 701, 702, 705, 710, 710, 711},
                        new int[]{707, 731, 859, 913, 934, 931, 905},
                },
                1
        );
        System.out.println(solution1);
    }
}