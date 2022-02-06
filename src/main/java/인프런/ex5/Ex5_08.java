package 인프런.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex5_08 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(final int n, final int m, final int[] arr) {
        int answer = 0;

        Queue<Patient> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(new Patient(i, arr[i]));
        }

        while (!q.isEmpty()) {
            Patient poll = q.poll();

            for (Patient patient : q) {
                if (poll.priority < patient.priority) {
                    q.offer(poll);
                    poll = null;
                    break;
                }
            }

            if (Objects.nonNull(poll)) {
                answer++;
                if (poll.id == m) {
                    return answer;
                }
            }
        }

        return answer;
    }

    private static class Patient {

        private int id;
        private int priority;

        public Patient(final int id, final int priority) {
            this.id = id;
            this.priority = priority;
        }

    }

}
