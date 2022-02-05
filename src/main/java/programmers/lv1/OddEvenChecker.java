package programmers.lv1;

public class OddEvenChecker {

    public String solution(int num) {
        if (isEven(num)) {
            return "Even";
        }

        return "Odd";
    }

    private boolean isEven(int num) {
        return (num & 1) == 0;
    }
}
