package 인프런.ex7;

import java.util.Scanner;

public class Ex7_01 {

    public static void main(String[] args) {
        // 특정 수까지 1씩 증가하게 출력하기
        Scanner sc = new Scanner(System.in);
        recursive(sc.nextInt());
    }

    private static void recursive(int n) {
        if (n == 0) {
            return;
        }

        recursive(n - 1);
        System.out.print(n + " ");
    }

}
