package programmers;

public class Ex12931 {

    public int solution(int n) {

        int value = n;

        int answer = 0;

        while (value > 0) {
            answer += value % 10;
            value /= 10;
        }
        return answer;
    }


    public static void main(String[] args) {

        Ex12931 ex12931 = new Ex12931();
        System.out.println(ex12931.solution(123));
    }

}
