package programmers.lv1;

import java.util.Arrays;

public class Ex12935 {

    //제일 작은 수 제거하기
    public static void main(String[] args) {
        Ex12935 test = new Ex12935();
        int[] arr = {10};
        Arrays.stream(test.solution(arr)).forEach(System.out::print);
    }


    public int[] solution(int[] arr) {
        int index = 0; //작은수 배열
        int min = Integer.MAX_VALUE; //가장 작은값

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        if (index == arr.length - 1) {
            for (int i = 0; i < index; i++) {
                answer[i] = arr[i];
            }
        } else if (index < arr.length - 1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[i];
            }

        }

        return answer;
    }
}
