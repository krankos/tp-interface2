public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double surface() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle of radius " + this.radius;
    }
}
