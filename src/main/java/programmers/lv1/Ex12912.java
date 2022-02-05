package programmers.lv1;

public class Ex12912 {

    public long solution(long a, long b) {
        long answer = 0;

        if (a == b) {
            return a;
        }

        if (a < b) {
            while (a <= b) {
                answer += a++;
            }
            return answer;
        }

        while (a >= b) {
            answer += a--;
        }

        return answer;
    }

}
