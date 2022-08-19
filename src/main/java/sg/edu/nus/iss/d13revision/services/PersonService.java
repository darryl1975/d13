package sg.edu.nus.iss.d13revision.services;

import org.springframework.stereotype.Service;

import java.util.*;
import sg.edu.nus.iss.d13revision.models.Person;

@Service
public class PersonService {
    private List<Person> persons = new ArrayList<Person>();

    public PersonService() {
        persons.add(new Person("Mark", "Zuckerberg"));
        persons.add(new Person("Elon", "Musk"));
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public void addPerson(Person p) {
        persons.add(new Person(p.getFirstName(), p.getLastName()));
    }

    public void updatePerson(Person p) {
        Person foundPerson = persons.stream().filter(o -> o.getId().equals(p.getId())).findAny().orElse(null);

        Person updatedPerson = new Person();
        updatedPerson.setId(p.getId());
        updatedPerson.setFirstName(p.getFirstName());
        updatedPerson.setLastName(p.getLastName());

        persons.remove(foundPerson);
        persons.add(new Person(updatedPerson.getId(), updatedPerson.getFirstName(), updatedPerson.getLastName()));
    }

    public void removePerson(Person p) {
        Person foundPerson = persons.stream().filter(o -> o.getId().equals(p.getId())).findAny().orElse(null);

        persons.remove(foundPerson);
    }
}
