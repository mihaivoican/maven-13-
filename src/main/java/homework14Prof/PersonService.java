package homework14Prof;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonService {
    @Getter         //generez automat getPersons() -> intoarce lista de persoane
    private final List<Person> persons = new ArrayList<>();

    public Person addPerson(Person person) {
        Person personWithId = new Person(getNewId(), person.getName(), person.getAge());
        getPersons().add(personWithId);
        return personWithId;
    }

    int getNewId() {
        //se da un random id tocmai pt a nu fi predictibil din afara; pt cei ce pot intui si sa intre sa vada ceva ce nu ar trebui
        Random random = new Random();
        //in bucla urmatoare incerc un nou id apoi verific daca exista si iar incerc altul pana gasesc unul nou
        while (true) {
            int randomId = random.nextInt(1000);
            if (!alreadyExists(randomId)) {     //verific sa nu mai am acel id  deja
                return randomId;
            }
        }
    }

    //caut daca mai exista acest id; intorc true daca deja exista
    Boolean alreadyExists(int personId) {
        for (Person person : getPersons()) {
            if (person.getId() == personId) {
                return true;
            }
        }
        return false;
    }
}
