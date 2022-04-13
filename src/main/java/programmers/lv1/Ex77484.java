package programmers.lv1;

public class Ex77484 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int correct = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
            } else {
                for (int win_num : win_nums) {
                    if (lotto == win_num) {
                        correct++;
                        break;
                    }
                }
            }
        }

        int min = correct;
        int max = correct + zero;

        int sixth = 6;

        return new int[]{Math.min(7 - max, sixth), Math.min(7 - min, sixth)};
    }

}
