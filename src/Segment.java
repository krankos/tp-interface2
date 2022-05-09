public class Segment implements Moveable, Drawable {
    private Point p1;
    private Point p2;

    private String color;

    // constructor
    public Segment(Point p1, Point p2, String color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    @Override
    public void translate(int x, int y) {
        this.p1.translate(x, y);
        this.p2.translate(x, y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a segment from " + this.p1 + " to " + this.p2 + " in color " + this.color);
    }

    @Override
    public String toString() {
        return "Segment from " + this.p1 + " to " + this.p2 + " in color " + this.color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

}
