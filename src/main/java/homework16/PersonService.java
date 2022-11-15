package homework16;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PersonService {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alina","Ionescu",23,"Cluj"),
                new Person("Mihai","Georgescu",45,"Husi"),
                new Person("Vlad","Zamfirescu",16,"Oradea"),
                new Person("Mihai","Tudorache",65,"Bucuresti")
        );



        Stream<Person> stream = persons.stream();
        //lista nume +prenume
        List<String> names = stream.map(c->c.firstName() + " " + c.lastName())
                .toList();
        System.out.println(names);

        //persoane majore
        List<Person> listaPersMajore = persons.stream().filter(c->c.age()>=18).toList();
        System.out.println(listaPersMajore);

        //- list all persons from Oradea
        List<Person> oradeni = persons.stream().filter(c->c.city() =="Oradea").toList();
        System.out.println(oradeni);

        //list all persons from Oradea OR Cluj
        List<Person> oradenisiclujeni = persons.stream().filter(c->c.city() =="Oradea" || c.city()=="Cluj").toList();
        System.out.println(oradenisiclujeni);

        //list all firstNames CAPITALIZED
        List<String> names2 = persons.stream().map(Person::firstName)
                .map(String::toUpperCase)
                .toList();
        System.out.println(names2);

        // list all person names: firstName firstletter from last name: Stefan B.
        List<String> names3 = persons.stream().map(c->c.firstName() + " " + c.lastName().charAt(0)).toList();
        System.out.println(names3);

        // list all persons with 18 < age < 60
        List<Person> personfAnAge =persons.stream().filter(c->c.age()>18 && c.age()<60).toList();
        System.out.println(personfAnAge);

//- list all persons having first name starting with A
        List<Person> persStartWithA = persons.stream().filter(p->p.firstName().startsWith("A"))
                .toList();
        System.out.println(persStartWithA);

// list all first names UNIQUELY
        List<String> firstNameUniquely = persons.stream().map(Person::firstName)
                .distinct()
                .toList();
        System.out.println(firstNameUniquely);

        //- sort the persons by first name
        List<Person> persSortedByName =persons.stream().sorted(Comparator.comparing(Person::firstName)).toList();
        System.out.println(persSortedByName);
    }


}
