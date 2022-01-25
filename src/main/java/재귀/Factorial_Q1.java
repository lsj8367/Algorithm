package 재귀;

import java.util.Scanner;

public class Factorial_Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetNum = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= targetNum; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }

}
