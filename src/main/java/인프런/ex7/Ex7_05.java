package 인프런.ex7;

public class Ex7_05 {

    private static int n = 3;
    private static int[] arr = new int[n + 1];

    public static void main(String[] args) {
        solution(1);
    }

    private static void solution(final int L) {
        if (L == n + 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (arr[i] == 1) {
                    sb.append(i).append(" ");
                }
            }

            if (sb.toString().length() > 0) {
                System.out.println(sb);
            }

        } else {
            arr[L] = 1;
            solution(L + 1);
            arr[L] = 0;
            solution(L + 1);
        }

    }

}
