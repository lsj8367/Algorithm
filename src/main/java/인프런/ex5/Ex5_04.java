package 인프런.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex5_04 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    private static int solution(final String ss) {
        final char[] chars = ss.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char aChar : chars) {
            if (isOperator(aChar)) {
                int number2 = stack.pop();
                int number1 = stack.pop();

                stack.push(postfix(number1, number2, aChar));
            } else {
                stack.push(Character.getNumericValue(aChar));
            }
        }

        return stack.pop();
    }

    private static int postfix(final int number1, final int number2, final char aChar) {

        switch (aChar) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
        }

        return number1 % number2;
    }

    private static boolean isOperator(char c) {

        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        }

        return false;
    }

}
