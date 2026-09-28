// Provide your Point class implementation here
public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isSame(Point point) {
        return this.x == point.x && this.y == point.y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}