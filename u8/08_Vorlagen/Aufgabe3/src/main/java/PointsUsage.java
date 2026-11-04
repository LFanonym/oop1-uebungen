public class PointsUsage {

    static void main() {

        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(23, 11);

        IO.println(p1);
        IO.println(p1.equals(p2));
        IO.println(p1.equals(p3));
        IO.println(p1.distanceTo(p2));
        IO.println(p1.distanceTo(p3));
    }
}