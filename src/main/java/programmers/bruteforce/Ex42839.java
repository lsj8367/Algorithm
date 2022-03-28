package programmers.bruteforce;

import java.util.HashSet;
import java.util.Set;

public class Ex42839 {

    Set<Integer> resultArr = new HashSet<>();

    public int solution(String numbers) {

        // 문자를 char 배열로 변경
        char[] temp = numbers.toCharArray();

        // char배열 값을 int배열로 바꾸기 위해 생성
        int[] arr = new int[temp.length];

        // char에서 '0'을 빼주면 0 ~ 9까지 값 나옴
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i] - '0';
        }

        for (int i = 1; i <= temp.length; i++) {
            permutation(arr, 0, temp.length, i);
        }

        return resultArr.size();
    }

    // 순열 : 순서O, 중복X
    private void permutation(int[] arr, int depth, int n, int r) {

        if (depth == r) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < r; i++) {
                sb.append(arr[i]);
            }

            // 소수일 때, 중복된 수가 아닐 때, 저장하기
            if (isPrime(Integer.parseInt(sb.toString()))) {
                resultArr.add(Integer.valueOf(sb.toString()));
            }

            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    private void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    // 소수 판별 함수
    private boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        int a = (int) Math.sqrt(n);
        for (int j = 2; j <= a; j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;
    }

}