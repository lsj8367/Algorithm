package programmers;

import java.util.Arrays;

public class Ex12933 {

    public Long solution(long n) {
        String str = String.valueOf(n);
        int[] arr = sortArray(str);
        return Long.parseLong(makeString(arr));
    }

    private int[] sortArray(String aa) {
        int[] arr = Arrays.stream(aa.split(""))
            .mapToInt(Integer::parseInt)
            .toArray();

        Arrays.sort(arr);
        return arr;
    }

    private String makeString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }

}
