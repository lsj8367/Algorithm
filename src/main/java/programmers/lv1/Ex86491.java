package programmers.lv1;

public class Ex86491 {

    public int solution(final int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            int width = sizes[i][0];
            int height = sizes[i][1];

            if (maxWidth < width) {
                maxWidth = width;
            }

            if (maxHeight < height) {
                maxHeight = height;
            }

        }

        return maxWidth * maxHeight;
    }

}
