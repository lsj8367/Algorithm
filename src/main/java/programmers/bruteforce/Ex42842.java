package programmers.bruteforce;

public class Ex42842 {

    public int[] solution(final int brown, final int yellow) {

        int width = 0;
        int height = 0;
        int area = brown + yellow; //넓이

        boolean isEnd = false;

        while (!isEnd) {
            width++;

            for (int i = 1; i <= width; i++) {
                if (width * i == area && (width - 2) * (i - 2) == yellow) {
                    isEnd = true;
                    height = i;
                    break;
                }
            }
        }

        return new int[]{width, height};
    }

}
