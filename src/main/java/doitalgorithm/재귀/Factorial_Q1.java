package doitalgorithm.재귀;

import java.util.Scanner;

public class Factorial_Q1 {

    private static int solution(final int n) {
        if (n == 1) {
            return 1;
        }

        return n * solution(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }


}
