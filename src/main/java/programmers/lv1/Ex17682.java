package programmers.lv1;

public class Ex17682 {

    public int solution(String dartResult) {
        int answer = 0;
        String temp = "";
        int[] arr = new int[3];
        int arrIndex = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            final char c = dartResult.charAt(i);
            switch (c) {
                case 'S':
                    arr[arrIndex] = (int) Math.pow(Integer.parseInt(temp), 1);
                    arrIndex++;
                    temp = null;
                    break;
                case 'D':
                    arr[arrIndex] = (int) Math.pow(Integer.parseInt(temp), 2);
                    arrIndex++;
                    temp = null;
                    break;
                case 'T':
                    arr[arrIndex] = (int) Math.pow(Integer.parseInt(temp), 3);
                    arrIndex++;
                    temp = null;
                    break;
                case '*':
                    // 일단 무조건 배열 첫번째는 차있음. 그리고 그 인덱스의 -1
                    // 자기 자신의 점수 무조건 2배
                    arr[arrIndex - 1] *= 2;

                    // 앞전에 얻은 점수가 있을때 이 점수도 2배
                    if (arrIndex > 1) {
                        arr[arrIndex - 2] *= 2;
                    }
                    break;
                case '#':
                    arr[arrIndex - 1] *= -1;
                    break;
                default:
                    if (dartResult.charAt(i + 1) == '0') {
                        temp = String.valueOf(c) + dartResult.charAt(i + 1);
                        i++;
                        break;
                    }
                    temp = String.valueOf(c);
                    break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }

}
