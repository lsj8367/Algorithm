package pack;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if(n > 0) return n * factorial(n - 1);
        else return 1;
    }

    static int factorial2(int n) {
        int count = 1;

        for(int i = n; i > 0; i--) {
            count *= i;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + "의 팩토리얼은" + factorial(n));

        System.out.println(factorial2(n));
    }
}
