package codeforce;

import java.util.Arrays;

public class Ex1614 {

    public int solution(final int[] info, final int[] prices) {
        final int n = info[0];
        final long minPrice = info[1];
        final long maxPrice = info[2];
        final long limitPrice = info[3];

        int count = 0;
        long boughtPrice = 0; // 가격이 int 초과하게 되면 오버플로우 발생해서 long으로 변환.
        Arrays.sort(prices);

        for (int i = 0; i < n; i++) {
            final long price = prices[i];

            //최소금액보다는 이상 최대 금액보다는 이하면 살 수 있음
            if (minPrice <= price && price <= maxPrice) {
                boughtPrice += price;
                if (boughtPrice <= limitPrice) {
                    count++;
                }
            }
        }
        return count;
    }

}
