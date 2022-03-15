package programmers.stack;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Ex42587 {

    public int solution(int[] priorities, int location) {

        Queue<Printer> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            q.offer(new Printer(i, priorities[i]));
        }

        int answer = 0;

        while (!q.isEmpty()) {
            Printer poll = q.poll();

            for (Printer printer : q) {
                if (poll.priority < printer.priority) {
                    q.offer(poll);
                    poll = null;
                    break;
                }
            }

            if (Objects.nonNull(poll)) {
                answer++;
                if (poll.index == location) {
                    return answer;
                }
            }

        }

        return answer;
    }

    private static class Printer {

        private int index;
        private int priority;

        public Printer(final int index, final int priority) {
            this.index = index;
            this.priority = priority;
        }

    }

}
