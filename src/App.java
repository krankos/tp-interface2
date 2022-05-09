public class App {
    public static void main(String[] args) throws Exception {

        // Ex1
        // Rectangle r = new Rectangle(1, 2);

        // r.ContainingSquare(20);

        // Circle c = new Circle(1);
        // c.ContainingSquare(1);

        // Ex2
        Client c = new Client("John", "Doe", 12345);
        Person p = new Person("Jane", "Doe");
        People ppl = new People();
        ppl.birth(c);
        ppl.birth(p);
        ppl.explore();

        // Ex3
    }
}
