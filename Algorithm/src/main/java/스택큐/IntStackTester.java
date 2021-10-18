package 스택큐;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while(true){
            System.out.println("현재 데이터 수 : " + stack.size() + "/" + stack.capacity());

            System.out.println("(1)push (2)pop (3)peak (4)dump " +
                    "(5)indexOf (6)clear (7)isEmpty (8)isFull (0)exit");

            int menu = sc.nextInt();
            if(menu == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            int x;
            switch (menu){
                case 1:
                    System.out.println("넣을 데이터 입력");
                    x = sc.nextInt();
                    try{
                        stack.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try{
                        x = stack.pop();
                        System.out.println(x + " 삭제함");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try{
                        x = stack.peek();
                        System.out.println("가장 마지막 값은 " + x);
                    }catch(IntStack.EmptyIntStackException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    stack.dump();
                    break;
                case 5:
                    //indexOf
                    System.out.println("찾을 값 입력");
                    int index = sc.nextInt();
                    x = stack.indexOf(index);
                    if(x == -1){
                        System.out.println("해당하는 값이 없음");
                        break;
                    }

                    System.out.println("값" + index + "가 " + x + "에 있습니다.");
                    break;

                case 6:
                    //clear
                    stack.clear();
                    System.out.println("스택이 초기화 되었습니다.");
                    break;
                case 7:
                    //isEmpty
                    if(stack.isEmpty()) System.out.println("스택이 비었음");
                    else System.out.println("데이터가 존재함");
                    break;
                case 8:
                    //isFull
                    if(stack.isFull()) System.out.println("가득참");
                    else System.out.println("공간있음");
                    break;
            }
        }
    }
}
