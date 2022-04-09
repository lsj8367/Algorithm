package programmers.lv1;

public class Ex67256 {

    public String solution(final int[] numbers, final String hand) {
        StringBuilder sb = new StringBuilder();

        int leftNumber = 10;
        int rightNumber = 12;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftNumber = number;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                rightNumber = number;
            } else {
                final int left = distance(leftNumber, number);
                final int right = distance(rightNumber, number);

                if (left > right) {
                    // 왼쪽번호가 더 멀때
                    sb.append("R");
                    rightNumber = number;
                } else if (left < right) {
                    sb.append("L");
                    leftNumber = number;
                } else {

                    if (hand.equals("right")) {
                        sb.append("R");
                        rightNumber = number;
                    } else {
                        sb.append("L");
                        leftNumber = number;
                    }
                }
            }
        }

        return sb.toString();
    }

    private int distance(int now, int targetNumber) {

        if (now == 0) {
            now = 11;
        }

        if (targetNumber == 0) {
            targetNumber = 11;
        }

        int x = (now - 1) / 3;
        int y = (now - 1) % 3;

        int targetX = targetNumber / 3;
        int targetY = 1;

        return Math.abs(x - targetX) + Math.abs(y - targetY);
    }

}
