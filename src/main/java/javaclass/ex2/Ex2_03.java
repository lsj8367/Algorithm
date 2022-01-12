package javaclass.ex2;

import java.util.Scanner;

public class Ex2_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N]; // 2 3 3 1 3
        int[] b = new int[N]; // 1 1 2 2 3
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            switch (a[i] - b[i]) {
                case 2:
                    System.out.println("B");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 0:
                    System.out.println("D");
                    break;
                case -1:
                    System.out.println("B");
                    break;
                case -2:
                    System.out.println("A");
                    break;
            }
        }

    }
}
