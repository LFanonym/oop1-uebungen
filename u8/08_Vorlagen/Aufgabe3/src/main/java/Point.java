public record Point(int x, int y) {
    public double distanceTo(Point other) {
        double distX = this.x - other.x;
        double distY = this.y - other.y;
        return Math.sqrt(distX*distX + distY*distY);
    }
}