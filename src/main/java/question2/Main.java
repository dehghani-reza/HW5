package question2;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(25, "mohammad", "dehghani",
                        new Address("hojati", "piroozi", 14, "tehran", 176673748)
                )
        );
        persons.add(new Person(20, "ali", "mahmodi",
                        new Address("rezvani", "samangan", 8, "tehran", 187475566)
                )
        );
        persons.add(new Person(24, "bagher", "abrishamkar",
                        new Address("azimzadegan", "fadaeian", 12, "tehran", 17524669)
                )
        );
        System.out.println(persons);


    }
}
