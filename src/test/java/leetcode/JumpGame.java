package leetcode;

import org.junit.jupiter.api.Test;

public class JumpGame {

    public boolean canJump(final int[] nums) {

        int endIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            endIndex = Math.max(i + value, endIndex);

            if (endIndex >= nums.length - 1) {
                return true;
            } else if (endIndex == i) {
                return false;
            }
        }
        return true;
    }

    @Test
    void test() {
        System.out.println(canJump(new int[]{2, 5, 0, 0}));
    }

}
