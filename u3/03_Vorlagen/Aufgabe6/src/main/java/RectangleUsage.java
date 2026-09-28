public class RectangleUsage {

    void main() {
        testConstructor();
        testIsSquare();
        testIsSame();
        testEncloses();
        testOverlaps();
        testStrench();
        testShrink();
        testStrechShrink();
    }

    private static void testConstructor() {
        Rectangle rect = new Rectangle(new Point(2, 2), new Point(6, 5));
        Point topLeft = rect.getTopLeft();
        boolean topLeftOk = topLeft.getX() == 2 && topLeft.getY() == 2;
        Point bottomRight = rect.getBottomRight();
        boolean bottomRightOk = bottomRight.getX() == 6 && bottomRight.getY() == 5;

        IO.println("testConstructor ok? " +  (topLeftOk && bottomRightOk));
    }

    private static void testIsSame() {
        Rectangle rect1 = new Rectangle(new Point(2, 2), new Point(4, 4));
        Rectangle rect2 = new Rectangle(new Point(2, 2), 2);

        IO.println("testIsSame1 ok? " + rect1.isSame(rect1));
        IO.println("testIsSame2 ok? " + rect1.isSame(rect2));
    }

    private static void testIsSquare() {
        Rectangle rect1 = new Rectangle(new Point(-2, -2), new Point(4, 4));
        IO.println("testIsSquare1 ok? " + rect1.isSquare());

        Rectangle rect2 = new Rectangle(new Point(2, 2), 2);
        IO.println("testIsSquare2 ok? " + rect2.isSquare());
    }

    private static void testEncloses() {
        Rectangle rect1 = new Rectangle(new Point(1, 1), new Point(4, 4));
        IO.println("testEncloses1 ok? " + rect1.encloses(rect1));

        Rectangle rect2 = new Rectangle(new Point(2, 2), new Point(5, 5));
        Rectangle rect3 = new Rectangle(new Point(3, 3), new Point(4, 4));
        IO.println("testEncloses2 ok? " + rect2.encloses(rect3));
        IO.println("testEncloses3 ok? " + !rect3.encloses(rect2));
        IO.println("testEncloses4 ok? " + !rect2.encloses(rect1));

        Rectangle rect4 = new Rectangle(new Point(2, 2), new Point(4, 4));
        IO.println("testEncloses5 ok? " + rect2.encloses(rect4));

        Rectangle rect5 = new Rectangle(new Point(3, 3), new Point(4, 6));
        IO.println("testEncloses6 ok? " + !rect2.encloses(rect5));
        // not all scenarios tested
    }

    private static void testOverlaps() {
        Rectangle rect = new Rectangle(new Point(2, 2), new Point(5, 5));
        Rectangle inside = new Rectangle(new Point(3, 3), new Point(4, 4));
        IO.println("testOverlaps01 ok? " + rect.overlaps(inside)); // areas overlap (also if fully enclosed)
        IO.println("testOverlaps02 ok? " + inside.overlaps(rect));

        Rectangle border = new Rectangle(new Point(4, 5), new Point(8, 9));
        IO.println("testOverlaps03 ok? " + !rect.overlaps(border)); // boundaries overlap
        IO.println("testOverlaps04 ok? " + !border.overlaps(rect));

        Rectangle overlap = new Rectangle(new Point(3, 4), new Point(8, 9));
        IO.println("testOverlaps05 ok? " + rect.overlaps(overlap));
        IO.println("testOverlaps06 ok? " + overlap.overlaps(rect));

        Rectangle upper = new Rectangle(new Point(0, 0), new Point(7, 1));
        IO.println("testOverlaps07 ok? " + !rect.overlaps(upper));
        IO.println("testOverlaps08 ok? " + !upper.overlaps(rect));

        Rectangle left = new Rectangle(new Point(0, 0), new Point(1, 7));
        IO.println("testOverlaps09 ok? " + !rect.overlaps(left));
        IO.println("testOverlaps10 ok? " + !left.overlaps(rect));

        Rectangle bottom = new Rectangle(new Point(0, 6), new Point(7, 6));
        IO.println("testOverlaps11 ok? " + !rect.overlaps(bottom));
        IO.println("testOverlaps12 ok? " + !bottom.overlaps(rect));

        Rectangle right = new Rectangle(new Point(6, 0), new Point(6, 7));
        IO.println("testOverlaps13 ok? " + !rect.overlaps(right));
        IO.println("testOverlaps14 ok? " + !right.overlaps(rect));
    }

    private static void testStrench() {
        Rectangle rect = new Rectangle(new Point(4, 5), new Point(7, 9));
        Rectangle expected = new Rectangle(new Point(4, 5), new Point(10, 13));
        IO.println("testStretch ok? " + rect.stretch(2).isSame(expected));
    }

    private static void testShrink() {
        Rectangle rect = new Rectangle(new Point(4, 5), new Point(13, 17));
        Rectangle expected = new Rectangle(new Point(4, 5), new Point(7, 9));
        IO.println("testShrink ok? " + rect.shrink(3).isSame(expected));
    }

    private static void testStrechShrink() {
        Rectangle rect = new Rectangle(new Point(1, 1), new Point(5, 9));
        Rectangle rect2 = new Rectangle(new Point(1, 1), new Point(5, 9));

        boolean result = rect.stretch(2).shrink(2).isSame(rect2);
        IO.println("testStretchShrink ok? " + result);
    }
}
