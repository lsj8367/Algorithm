package 재귀;

import java.util.Scanner;

public class Gcd_Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(solution(x, y));
    }

    private static int solution(final int x, final int y) {
        int newX = x;
        int newY = y;
        while (newY >= 0) {
            int temp = newX % newY;
            if (temp == 0) {
                break;
            }

            newX = newY;
            newY = temp;

        }
        return newY;
    }

}
