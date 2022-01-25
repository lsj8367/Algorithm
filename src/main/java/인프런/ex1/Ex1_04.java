package 인프런.ex1;

import java.util.Scanner;

public class Ex1_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            String[] text = sc.next().split("");
            StringBuilder sb = new StringBuilder();
            for (int j = text.length - 1; j >= 0; j--) {
                sb.append(text[j]);
            }
            System.out.println(sb);
        }
    }
}
