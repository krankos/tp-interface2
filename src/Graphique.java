public class Graphique {
    public static void main() {
        // make points for a triangle

        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);

        // make a triangle
        Triangle t = new Triangle(p1, p2, p3, "red");
        // make a segment
        Segment s = new Segment(p1, p2, "blue");

        // draw the triangle
        t.draw();
        // draw the segment
        s.draw();
    }
}
