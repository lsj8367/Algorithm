package pack;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    private static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    private static void bubbleSort(int[] a, int n) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = n - 1; j > i; j--) {
                if(a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.stream(a).forEach(System.out::println);


        bubbleSort(a, n);
        System.out.println();


        Arrays.stream(a).forEach(System.out::println);
    }
}
