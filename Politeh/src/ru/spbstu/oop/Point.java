package ru.spbstu.oop;

/**
 * Created by sergey.tovmasyan on 08/09/16.
 */
class Point {
    int x;
    int y;

    public Point() {
    }

    public Point(int x) {
        this.x = x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(1);
        Point point3 = new Point(3,5);
    }
}
