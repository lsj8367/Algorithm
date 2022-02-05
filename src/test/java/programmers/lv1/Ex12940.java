package programmers.lv1;

public class Ex12940 {
    public int[] solution(int n, int m) {

        int[] answer = new int[2];

        int gcd = gcd(n, m);

        answer[0] = gcd;
        answer[1] = (n * m) / gcd;

        return answer;
    }

    private int gcd(int n, int m) {
        while (m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }

        return n;
    }
}
