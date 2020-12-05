package mycode;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    public Set<Person> neighbor;
    public int id;
    public Person(String name) {
        this.name = name;
        this.neighbor = new HashSet<>();
    }

    public String getName() {
        return name;
    }
}
