package 인프런.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex2_06 {

    //설명
    //N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
    //예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
    //첫 자리부터의 연속된 0은 무시한다.
    //입력
    //첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
    //각 자연수의 크기는 100,000를 넘지 않는다.
    //출력
    //첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");

        int[] reverseArray = new int[N];

        for (int i = 0; i < inputArr.length; i++) {
            StringBuilder sb = new StringBuilder(inputArr[i]);
            reverseArray[i] = Integer.parseInt(sb.reverse().toString());
        }
        
        // 최대값 찾아서 걔까지 소수 판별하는걸 만듦
        int max = 0;
        for (int i = 0; i < reverseArray.length - 1; i++) {
            if (max < reverseArray[i]) {
                max = reverseArray[i];
            }
        }

        int[] eratosTenes = new int[max + 1];

        //소수 배열
        List<Integer> decimalList = new ArrayList<>();

        for (int i = 2; i <= max; i++) {
            if (eratosTenes[i] == 0) {
                decimalList.add(i);
                for (int j = i; j <= max; j+=i) {
                    eratosTenes[j] = 1;
                }
            }
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < reverseArray.length; i++) {
            if (decimalList.contains(reverseArray[i])) {
                answer.add(reverseArray[i]);
            }
        }

        for (final Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
