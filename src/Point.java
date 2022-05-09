public class Point implements Moveable {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // copy constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // method toString
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    @Override
    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }

}
