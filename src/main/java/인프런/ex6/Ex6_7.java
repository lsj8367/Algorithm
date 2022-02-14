package 인프런.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex6_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Point> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }

        Collections.sort(list);

        for (Point point : list) {
            point.printXY();
        }

    }

    private static class Point implements Comparable<Point> {

        private int pointX;
        private int pointY;

        public Point(final int x, final int y) {
            this.pointX = x;
            this.pointY = y;
        }

        public void printXY() {
            System.out.println(pointX + " " + pointY);
        }

        @Override
        public int compareTo(final Point o) {

            if (this.pointX == o.pointX) {
                return this.pointY - o.pointY;
            }

            return this.pointX - o.pointX;
        }

    }

}
