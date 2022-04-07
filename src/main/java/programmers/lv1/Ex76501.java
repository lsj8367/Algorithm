package programmers.lv1;

public class Ex76501 {

    public int solution(final int[] absolutes, final boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                sum += absolutes[i];
            } else {
                sum += -1 * absolutes[i];
            }
        }

        return sum;
    }

}
