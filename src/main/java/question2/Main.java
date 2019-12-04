package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(25, "mohammad", "dehghani",
                        new Address("hojati", "piroozi", 14, "tehran", 176673748)
                )
        );
        persons.add(new Person(20, "ali", "mahmodi",
                        new Address("rezvani", "samangan", 8, "mashhad", 187475566)
                )
        );
        persons.add(new Person(24, "bagher", "abrishamkar",
                        new Address("azimzadegan", "fadaeian", 4, "tehran", 17524669)
                )
        );
        System.out.println(persons);
        System.out.println("*********************************************************");
        Collections.sort(persons);
        System.out.println(persons);
        System.out.println("*********************************************************");
        Person.CompareByLastName compareByLastName = new Person.CompareByLastName();
        Collections.sort(persons, compareByLastName);
        System.out.println(persons);
        System.out.println("*********************************************************");
        List<Person> tehranZone = persons.stream().filter(p -> p.address.city != "tehtan").filter(p -> p.address.zone < 5).collect(Collectors.toList());
        System.out.println(tehranZone);
    }// end of method main
}
