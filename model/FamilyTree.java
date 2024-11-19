package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FamilyTree<T extends Person> implements Serializable {
    private List<T> members = new ArrayList<>();

    public void addMembers(T person) {
        members.add(person);
    }

    public List<T> getMembers() {
        return new ArrayList<>(members);
    }

    public void sortByName() {
        members.sort(Comparator.comparing(Person::getName));
    }

    public void sortByBirthYear() {
        if (members.get(0) instanceof Person){
            members.sort(Comparator.comparingInt(Person::getBirthYear));
        }
    }
}
        