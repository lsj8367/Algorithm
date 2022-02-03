package 인프런.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex5_05 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stick = br.readLine();

        Stack<Character> stack = new Stack<>();

        int answer = 0;

        for (int i = 0; i < stick.length(); i++) {
            char ch = stick.charAt(i);
            if (ch == '(') { // (면 스택에 넣음
                stack.push(ch);
            } else {
                stack.pop(); // ) 만나면 일단 pop

                if (stick.charAt(i - 1) == '(') { //근데 앞부분이 (로 시작하면 괄호 전체 갯수 더함
                    answer += stack.size();
                } else { //아니면 남은 쇠막대기 끝부분 1을 증가시킴
                    answer++;
                }

            }
        }

        System.out.println(answer);
    }
}
