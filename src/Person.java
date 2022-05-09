public class Person implements Man {
    // has first name and last name
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void identity() {
        System.out.println("My name is " + firstName + " " + lastName);
    }
}
