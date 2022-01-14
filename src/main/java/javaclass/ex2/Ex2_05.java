package javaclass.ex2;

import java.util.Scanner;

public class Ex2_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] arr = new boolean[N + 1];
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }

        for (int i = 2; i < Math.sqrt(N); i++) {
            if (arr[i]) {
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                count++;
            }
        }

        System.out.println(count);

    }
}
