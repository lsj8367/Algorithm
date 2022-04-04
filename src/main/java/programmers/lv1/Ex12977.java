package programmers.lv1;

public class Ex12977 {

    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int value = nums[i] + nums[j] + nums[k];

                    if (value % 2 != 0) {
                        answer += isPrime(value);
                    }
                }
            }
        }
        return answer;
    }

    private int isPrime(final int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return 0;
            }
        }
        return 1;
    }

}
