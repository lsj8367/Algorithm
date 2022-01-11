package javaclass.ex1;

import java.util.Scanner;

public class Ex1_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt(), sc.next()));
    }

    private static String solution(int index, String input) {
        String answer = "";
        for (int i = 0; i < index; i++) {
            String token = input.substring(0, 7).replace('#', '1').replace('*', '0');
            input = input.substring(7);
            answer += (char) Integer.valueOf(token, 2).intValue();
        }
        return answer;
    }

}
