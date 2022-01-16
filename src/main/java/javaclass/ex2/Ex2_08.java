package javaclass.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> answer = new ArrayList<>();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    rank++;
                }
            }
            answer.add(rank);
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
