package programmers.lv1;

public class 정수제곱근판별 {

    public long solution(long n) {

        Double sqrt = Math.sqrt(n);
        if (sqrt == sqrt.intValue()) {
            return (long) Math.pow(sqrt + 1, 2);
        }

        return -1;
    }
}
