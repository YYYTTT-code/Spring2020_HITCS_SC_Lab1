package mycode;

import mycode.Person;
import java.util.*;

public class FriendshipGraph {
    private int numOfPerson;
    private Set<String> nameSet;
    private List<Person> personList;

    public FriendshipGraph() {
        this.numOfPerson = 0;
        this.nameSet = new HashSet<>();
        this.personList = new ArrayList<>();
    }
    public void addVertex(Person p){
        if(this.nameSet.contains(p.getName())){
            System.out.println(p.getName() + " has been used before!");
            System.exit(-1);
        }
        p.id=this.numOfPerson++;
        this.nameSet.add(p.getName());
        this.personList.add(p);

    }

    public void showPersonName(){
        for(String s:nameSet){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        FriendshipGraph graph = new FriendshipGraph();
        Person rachel = new Person("Rachel");
        Person ross = new Person("Ross");
        Person ben = new Person("Ben");
        Person kramer = new Person("Kramer");
        graph.addVertex(rachel);
        graph.addVertex(ross);
        graph.addVertex(ben);
        graph.addVertex(kramer);
        graph.showPersonName();

    }
}
