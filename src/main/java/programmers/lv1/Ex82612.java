package programmers.lv1;

public class Ex82612 {

    public long solution(final int price, final int money, final int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        if (sum <= money) {
            return 0;
        }

        return sum - money;
    }

}
