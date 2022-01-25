package 재귀;

import java.util.Scanner;

public class EuclidGCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(gcd(x, y));
    }

    private static int gcd(final int x, final int y) {
        if (y == 0) {
            return x;
        }

        return gcd(y, x % y);
    }

}
