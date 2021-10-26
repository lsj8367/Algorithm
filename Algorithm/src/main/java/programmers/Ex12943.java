package programmers;

public class Ex12943 {

    public int solution(int num) {
        return oddEven(num);
    }

    private int oddEven(long num) {
        int result = 0;

        while(num != 1 && result <= 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }

            result++;
        }

        if (result >= 500) {
            return -1;
        }

        return result;
    }
}
