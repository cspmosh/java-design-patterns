package FactoryPattern;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(PersonFactory.createPerson("Josh"));
        people.add(PersonFactory.createPerson("Jon"));
        people.add(PersonFactory.createPerson("Jason"));
        people.add(PersonFactory.createPerson("Jeremy"));
        printPeople(people);
    }

    public static void printPeople(ArrayList<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
