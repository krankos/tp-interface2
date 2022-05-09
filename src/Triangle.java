
public class Triangle implements Moveable, Drawable {
    private Point p1;
    private Point p2;
    private Point p3;

    private String color;

    // constructor
    public Triangle(Point p1, Point p2, Point p3, String color) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = color;
    }

    @Override
    public void translate(int x, int y) {
        this.p1.translate(x, y);
        this.p2.translate(x, y);
        this.p3.translate(x, y);
    }

    @Override
    public void draw() {
        System.out.println(
                "Drawing a triangle from " + this.p1 + " to " + this.p2 + " to " + this.p3 + " in color " + this.color);
    }

    @Override
    public String toString() {
        return "Triangle from " + this.p1 + " to " + this.p2 + " to " + this.p3 + " in color " + this.color;
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
