public abstract class Shape {
    // Shape has abstract method area() and surface()
    public abstract double area();

    public abstract double surface();

    public abstract String toString();

    public void ContainingSquare(double surf) {
        if (surf <= this.surface()) {
            System.out.println("This " + this.toString() + " can contain a square of surface " + surf);
        } else {
            System.out.println("This " + this.toString() + " shape can not contain a square of surface " + surf);
        }
    }
}
