package peoplemanagement;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        person.inputInfo();
        people.add(person);
        System.out.println("Added successfully!\n");
    }

    public void displayAll() {
        if (people.isEmpty()) {
            System.out.println("The list is empty!");
            return;
        }
        for (Person person : people) {
            person.displayInfo();
            System.out.println("----------------------");
        }
    }
}
