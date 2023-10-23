package programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex178871Test {

    Ex178871 demo = new Ex178871();

    @Test
    void test() {
        final String[] solution = demo.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"},
                new String[]{"kai", "kai", "mine", "mine"});

        for (String s : solution) {
            System.out.println(s);
        }
    }

}
