package 인프런.ex7;

//재귀 함수를 이용한 이진수 출력
public class Ex7_02 {

    private final StringBuilder sb = new StringBuilder();

    public String solution(int n) {

        if (n == 0) {
            return null;
        }

        solution(n / 2);
        sb.append(n % 2);

        return sb.toString();
    }

}
