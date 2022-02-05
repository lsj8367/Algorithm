package programmers.lv1;

public class Ex12932 {

    public int[] solution(long n) {

        int[] answer = new int[String.valueOf(n).length()];

        int cnt = 0;

        while (n > 0) {
            answer[cnt] = (int) (n % 10);

            n /= 10;

            cnt++;
        }

        return answer;
    }

}
