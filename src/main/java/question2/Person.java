package question2;

public class Person {
    int age;
    String firstName;
    String lastName;
    Address address;

    public Person(int age, String firstName, String lastName, Address address) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "\naddress=" + address +
                '}';
    }
}
