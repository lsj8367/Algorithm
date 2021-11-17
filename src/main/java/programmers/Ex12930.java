package programmers;

import java.util.Locale;

public class Ex12930 {

    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int index = 0;

        for (String str : arr) {
            if(str.equals(" ")) {
                answer += " ";
                index = 0;
            }else if (index % 2 == 0) {
                answer += str.toUpperCase(Locale.ROOT);
                index++;
            }else if (index % 2 != 0) {
                answer += str.toLowerCase(Locale.ROOT);
                index++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex12930 ex12930 = new Ex12930();
        System.out.println(ex12930.solution("try hello world"));
    }
}
