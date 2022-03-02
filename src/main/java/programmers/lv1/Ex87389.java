package programmers.lv1;

public class Ex87389 {

    public int solution(final int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return n;
    }

}
