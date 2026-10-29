
package Midterm;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(x=" + x + ", y=" + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }

        Point other = (Point) obj;

        return this.x == other.x && this.y == other.y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(3, 5);
        Point p3 = new Point(2, 5);

        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
