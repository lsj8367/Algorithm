package programmers.lv1;

public class Ex12948 {

    public static void main(String[] args) {
        String ss = "01012345678";

        Ex12948 ex12948 = new Ex12948();
        ex12948.solution(ss);
    }

    public String solution(String phone_number) {
        String frontStr = phone_number.substring(0, phone_number.length() - 4);

        String answer = "";
        for (int i = 0; i < frontStr.length(); i++) {
            answer += "*";
        }

        return answer + phone_number.substring(phone_number.length() - 4);
    }
}
