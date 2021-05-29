package ex03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//신체검사 데이터 배열에서 이진 검색하기
public class PhysExamSearch {
    //신체 검사 데이터를 정의
    static class PhyscData{
        private String name;    //이름
        private int height;     //키
        private double vision;  //시력

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        //문자열 반환
        public String toString(){
            return name + " " + height + " " + vision;
        }

        //오름차순 정렬 Comparator
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        // Comparator는 기본적으로 정렬기준을 정해주면 바로 실행된다.
        private static class HeightOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                       (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("홍길동", 178, 0.4),
                new PhyscData("고길동", 163, 1.5),
                new PhyscData("가나다", 162, 1.7),
                new PhyscData("신기해", 161, 2.0),
                new PhyscData("엄석대", 153, 1.6),
                new PhyscData("태극기", 168, 0.1),
                new PhyscData("한국인", 184, 1.7),
        };
        System.out.println(x.length);
        for(PhyscData xval : x){
            System.out.println(xval);
        }
        System.out.println("찾고싶은 신장을 입력해주세요. cm"); //키 값 입력받기
        int height = sc.nextInt();

        int idx = Arrays.binarySearch(
                x,                                             // 배열 x에서
                new PhyscData("", height, 0.0),   // 키가 height인 요소를
                PhyscData.HEIGHT_ORDER                        // HEIGHT_ORDER에 의해 검색함
        );

        System.out.println(idx);
        if(idx < 0)
            System.out.println("요소가 없습니다");
        else{
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은데이터 : " + x[idx]);
        }
    }
}
