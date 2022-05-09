public class Client extends Person {
    private int number;

    public Client(String firstName, String lastName, int number) {
        super(firstName, lastName);
        this.number = number;
    }

    @Override
    public void identity() {
        System.out.println(
                "My name is " + this.getFirstName() + " " + this.getLastName() + " and my number is " + number);
    }
}
