package programmers;

import java.util.Arrays;

public class Ex12944 {

    public double solution(int[] arr) {
        double result = Arrays.stream(arr).asDoubleStream().sum();

        return result / (double) arr.length;
    }

}
