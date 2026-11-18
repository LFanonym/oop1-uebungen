/// Provide your Point class implementation here
public class Rectangle {
    private Point topLeft, bottomRight;
    private int getWidth() {
        return this.bottomRight.getX() - this.topLeft.getX();
    }
    private int getHeight() {
       return this.bottomRight.getY() - this.topLeft.getY();
    }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle(Point topLeft, int size) {
        this.topLeft = topLeft;
        this.bottomRight = new Point(topLeft.getX() + size, topLeft.getY() + size);
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public Point getBottomRight() {
        return this.bottomRight;
    }


    public boolean isSame(Rectangle r2) {
        return this.topLeft.isSame(r2.getTopLeft()) && this.bottomRight.isSame(r2.getBottomRight());
    }

    public boolean isSquare() {
        return this.getWidth() == this.getHeight();
    }

    public boolean encloses(Rectangle r1) {
        boolean topLeftInside = this.topLeft.getX() <= r1.getTopLeft().getX() && this.topLeft.getY() <= r1.getTopLeft().getY();
        boolean bottomRightInside = this.bottomRight.getX() >= r1.getBottomRight().getX() && this.bottomRight.getY() >= r1.getBottomRight().getY();

        return topLeftInside && bottomRightInside;
    }

    public boolean overlaps(Rectangle inside) {
        int originalXLeft = this.getTopLeft().getX();
        int originalYTop = this.getTopLeft().getY();
        int originalXRight = this.getBottomRight().getX();
        int originalYBottom = this.getBottomRight().getY();
        int insideXLeft = inside.getTopLeft().getX();
        int insideYTop = inside.getTopLeft().getY();
        int insideXRight = inside.getBottomRight().getX();
        int insideYBottom = inside.getBottomRight().getY();

        boolean hasPointRight = insideXRight > originalXLeft || insideXLeft > originalXLeft;
        boolean hasPointLeft = insideXLeft < originalXRight || insideXRight < originalXRight;
        boolean hasPointAbove = insideYTop < originalYBottom || insideYBottom < originalYBottom;
        boolean hasPointBelow = insideYBottom > originalYTop || insideYTop > originalYTop;

        return hasPointRight && hasPointLeft && hasPointAbove && hasPointBelow;
    }

    public Rectangle stretch(int i) {
        Point newBottomRight = new Point(this.topLeft.getX() + (getWidth() * i), this.topLeft.getY() + (getHeight() * i));
        return new Rectangle(this.topLeft, newBottomRight);
    }

    public Rectangle shrink(int i) {
        Point newBottomRight = new Point(this.topLeft.getX() + (getWidth() / i), this.topLeft.getY() + (getHeight() / i));
        return new Rectangle(this.topLeft, newBottomRight);
    }
}