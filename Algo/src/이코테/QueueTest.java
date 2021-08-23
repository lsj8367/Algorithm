package 이코테;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        //선입선출 큐 테스트
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);   //깂 추가
        queue.offer(4); //값 추가
        System.out.println(queue);
        queue.poll();   // 첫번 값 반환 후 제거 비어있으면 null
        System.out.println(queue);
        queue.remove(); // 큐 첫번째 값 제거
        System.out.println(queue);
        queue.clear(); // 큐 초기화
    }
}
