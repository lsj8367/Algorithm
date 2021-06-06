package ex03;

public class GenericClassTester {
    //제네릭 클래스의 파라미터를 T라고 작성
    static class GenericClass<T>{
        private final T xyz;
        GenericClass(T t){
            this.xyz = t;
        }
        T getXyz(){
            return xyz;
        }
    }

    public static void main(String[] args) {
        //파라미터에 String, Integer 이렇게 넘길 수 있다.
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(123);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
