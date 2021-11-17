package pack;

public class EucArray {

    static int euc(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    static int eucArray(int[] arr, int index, int length) {
        if(length == 1) {
            return arr[index];
        }

        if(length == 2) {
            return euc(arr[index], arr[index + 1]);
        }

        return euc(arr[index], eucArray(arr, index + 1, length - 1));
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 12, 15};
        System.out.println(eucArray(arr, 0, arr.length));
    }
}
