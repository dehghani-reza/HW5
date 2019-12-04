package question2;

import java.util.Comparator;

public class Person implements Comparable<Person> {
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

    public int compareTo(Person o) {
        if(o.age>this.age){return -1;}
        if(o.age<this.age){return +1;}
        return 0;
    }
    public static class CompareByLastName implements Comparator<Person> {


        public int compare(Person o1, Person o2) {
            if(o1.lastName.length()<o2.lastName.length()){return -1;}
            if(o1.lastName.length()>o2.lastName.length()){return +1;}
            return 0;
        }
    }
}
