package 인프런.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(solution(list));
    }

    private static int solution(List<Integer> list) {
        int min = 0;
        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            if (min < list.get(i)) {
                result++;
                min = list.get(i);
            }
        }

        return result;
    }
}
