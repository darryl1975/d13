package sg.edu.nus.iss.d13revision.models;

import java.util.UUID;

public class Person {
    private String id;
    private String firstName;
    private String lastName;

    public Person() {
        // this.id = UUID.randomUUID().toString().substring(0, 8);
    }

    public Person(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.id = UUID.randomUUID().toString().substring(0, 8);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
    }
}
