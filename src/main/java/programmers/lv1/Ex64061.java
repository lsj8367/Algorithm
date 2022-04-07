package programmers.lv1;

import java.util.Stack;

public class Ex64061 {

    public int solution(int[][] board, int[] moves) {

        Stack<Integer> stack = new Stack<>();

        int count = 0;

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                // 칸 하나씩 올라감 (1,2,3,4,5)
                final int value = board[i][move - 1];
                if (value != 0) {
                    if (stack.isEmpty()) {
                        stack.push(value);
                    } else if (stack.peek() == value) {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.push(value);
                    }
                    board[i][move - 1] = 0;

                    break;
                }
            }
        }

        return count;
    }

}
