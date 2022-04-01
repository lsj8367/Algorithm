package programmers.lv1;

public class Ex68935 {

    public int solution(int n) {

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }

        int answer = 0;

        final char[] chars = sb.toString().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            answer += Integer.parseInt(String.valueOf(chars[i])) * Math.pow(3, chars.length - i - 1);
        }

        return answer;
    }

}
