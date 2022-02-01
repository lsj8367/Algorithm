package 인프런.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex5_03 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        StringTokenizer st;

        //input
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int move = Integer.parseInt(br.readLine());

        int[] moves = new int[move];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < move; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr, moves));
    }

    private static int solution(final int[][] arr, final int[] moves) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int answer = 0;

        for (Integer move : moves) {
            for (int i = 0; i < arr.length; i++) {
                final int target = arr[i][move - 1];
                if (target != 0) {
                    if (stack.peek() == target) {
                        stack.pop();
                        answer += 2; // 캔디팡 되려면 타겟 + 현재 있던 최고값 해서 2개
                    } else {
                        stack.push(target);
                    }
                    arr[i][move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

}
