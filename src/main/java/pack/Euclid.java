package pack;

public class Euclid {
    static int gcd(int x, int y) {
        System.out.println(x + " " + y);
        if(y == 0) {
            return x;
        }

        return gcd(y, x % y);
    }

    static int gcd2(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 22;
        System.out.println(gcd(x, y));
    }
}
