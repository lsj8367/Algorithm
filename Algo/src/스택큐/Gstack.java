package 스택큐;

public class Gstack<E> {
    //제네릭을 이용한 스택 클래스 구현하기
    private int max;   //스택 용량
    private int ptr;   //스택 포인터
    private E[] stk; //스택 본체

    //실행시 예외 : 스택이 비어있을때
    public static class EmptyGstackException extends RuntimeException{
        public EmptyGstackException(){

        }
    }

    //실행시 예외 : 스택이 가득 참
    public static class OverflowGstackException extends RuntimeException{
        public OverflowGstackException(){

        }

        @Override
        public String getMessage() {
            return "스택이 가득참";
        }
    }

    public Gstack(int capacity) {
        ptr = 0;                //초기 상태 포인터 0
        max = capacity;         //스택 용량
        try {
            stk = (E[]) new Object[max]; //배열 길이가 max인 스택 배열 생성
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    //스택에 값 집어넣음
    public E push(E x) throws OverflowGstackException{
        if(ptr >= max) throw new OverflowGstackException();
        return stk[ptr++] = x; //전달 받은 x를 stk[ptr]에 넣고 ptr을 1 증가시킨다.
    }

    //스택 맨 꼭대기의 데이터를 꺼냄
    public E pop() throws EmptyGstackException {
        if(ptr <= 0) throw new EmptyGstackException();
        return stk[--ptr];
    }

    //스택 정상의 데이터 가져오기
    public E peek() throws EmptyGstackException{
        if(ptr <= 0) throw new EmptyGstackException();
        return stk[ptr - 1];
    }

    //몇번째에 해당하는 값이 있는지
    public int indexOf(E x){
        //맨 위부터 선형 검색
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i] == x) return i;        //값이 있다면 해당하는 ptr반환
        return -1;                       //검색 실패시
    }

    //스택의 모든 요소를 제거
    public void clear(){
        ptr = 0;
        //확인한 결과 실제 stk배열에는 값이 들어가있지만
        //포인터를 0으로 설정함으로써 초기화가 된것처럼 되었고
        //인덱스 0부터 다시 값을 삽입하기 때문에 초기화된것처럼 보인다.
    }

    //스택의 용량을 확인함
    public int capacity(){
        return max;
    }

    //스택에 쌓인 데이터 수를 확인함
    public int size(){
        return ptr;
    }

    //스택이 비었는지
    public boolean isEmpty(){
        return ptr <= 0;
    }

    //스택이 가득 찼는지
    public boolean isFull(){
        return ptr >= max;
    }

    //스택 안의 모든 데이터를 바닥에서 꼭대기까지 출력
    public void dump(){
        if(ptr <= 0) System.out.println("스택이 비었습니다");
        else {
            for(int i = 0; i < ptr; i++){
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
