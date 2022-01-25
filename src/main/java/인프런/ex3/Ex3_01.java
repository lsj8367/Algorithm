package 인프런.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] newArr = new int[arr.length + arr2.length];

        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.arraycopy(arr2, 0, newArr, arr.length, arr2.length);

        Arrays.sort(newArr);

        for (int i : newArr) {
            System.out.print(i + " ");
        }

    }
}
