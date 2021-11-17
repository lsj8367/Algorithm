package pack;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort_Q1 {

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }


    private static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j + 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 7;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.stream(arr).forEach(System.out::println);

        bubbleSort(arr, n);
        System.out.println();

        Arrays.stream(arr).forEach(System.out::println);
    }
}
