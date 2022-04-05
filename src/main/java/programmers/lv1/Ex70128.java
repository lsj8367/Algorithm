package programmers.lv1;

public class Ex70128 {

    public int solution(final int[] a, final int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

}
