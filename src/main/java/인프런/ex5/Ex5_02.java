package 인프런.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex5_02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solution(br.readLine()));
    }

    private static String solution(String ss) {
        final char[] chars = ss.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {

            if (aChar == ')') {
                while (stack.pop() != '(')
                    ;
            } else {
                stack.push(aChar);
            }
        }

        String result = "";
        for (int i = 0; i < stack.size(); i++) {
            result += stack.get(i);
        }

        return result;
    }

}
