public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public double surface() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle of width " + this.width + " and height " + this.height;
    }

}
