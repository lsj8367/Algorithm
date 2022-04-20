package programmers.lv2;

public class Ex12953 {

    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = answer * arr[i] / gcd(answer, arr[i]);
        }

        return answer;
    }

    private int gcd(int a, int b) {
        int x = Math.max(a, b);
        int y = Math.min(a, b);

        while (x % y != 0) {
            int v = x % y;
            x = y;
            y = v;
        }

        return y;
    }

}
