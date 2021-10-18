package 스택큐;

public class Gqueue<E> {
    private int max;    //큐 용량
    private int num;    //현재 데이터 수
    private int front;  //프런트 요소 커서
    private int rear;   //리어 요소 커서
    private E [] que;   //큐의 본체

    // 실행 시 예외 : 큐가 비어 있음
    public static class EmptyGQueueException extends RuntimeException{
        public EmptyGQueueException(){
        }

        @Override
        public String getMessage() {
            return "큐가 비어있음";
        }
    }

    // 실행 시 예외 : 큐가 가득 참
    public static class OverflowGQueueException extends RuntimeException{
        public OverflowGQueueException() {
        }

        @Override
        public String getMessage() {
            return "큐가 가득 참";
        }
    }

    public Gqueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try{
            que = (E[]) new Object[max];      // 큐 본체용 배열 생성
        }catch (OutOfMemoryError e){ // 생성 못할때
            max = 0;
        }
    }

    // 큐에 데이터를 인큐함(넣기)
    public E enque(E x) throws OverflowGQueueException {
        if(num >= max) throw new OverflowGQueueException(); // 큐가 가득참

        que[rear++] = x;
        num++;

        if(rear == max) rear = 0;

        return x;
    }

    // 큐에서 데이터를 디큐(꺼냄)
    public E deque() throws EmptyGQueueException {
        if(num <= 0) throw new EmptyGQueueException(); //큐가 비었음

        E x = que[front++];
        num--;
        if(front == max) front = 0;

        return x;
    }

    // 큐에서 데이터를 피크(프런트 데이터 조회)
    public E peek() throws EmptyGQueueException {
        if(num <= 0) throw new EmptyGQueueException();

        return que[front];
    }

    // 큐에서 x를 검색하여 인덱스(없으면 -1) 반환
    public int indexOf(E x){
        for(int i = 0; i < num; i++){
            int idx = (i + front) % max;
            if(que[idx] == x) //검색 성공시
                return idx;
        }

        return -1; //검색 실패
    }

    // 큐를 비움
    public void clear(){
        num = front = rear = 0;
    }

    // 큐의 용량을 반환
    public int capacity(){
        return max;
    }

    // 큐에 쌓여있는 데이터 수 반환
    public int size(){
        return num;
    }

    // 큐가 비었는지
    public boolean isEmpty(){
        return num <= 0;
    }

    //큐가 가득찼는지
    public boolean isFull(){
        return num >= max;
    }

    //큐 안의 모든 데이터를 front => rear 출력
    public void dump(){
        if(isEmpty()){
            System.out.println("큐가 비었음");
        }else{
            for(int i = 0; i < num; i++){
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }

    // 임의의 데이터 검색
    public int search(E x){
        for(int i = 0; i < num; i++){
            if(que[(i + front) % max] == x)
                return i + 1;
        }
        return 0;
    }
}
