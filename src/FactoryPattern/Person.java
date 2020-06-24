package FactoryPattern;

public class Person {
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return "Person {" + newline +
                "id: " + id + newline +
                "name: " + name + newline +
                        "}" + newline;
    }
}

class PersonFactory
{
    private static int personId = 0;
    public static Person createPerson(String name)
    {
        Person person = new Person(personId++, name);
        return person;
    }
}