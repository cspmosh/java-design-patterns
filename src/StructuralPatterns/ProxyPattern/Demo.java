package StructuralPatterns.ProxyPattern;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person(15);
        ResponsiblePerson rp = new ResponsiblePerson(p);
        System.out.println(rp.drink());
        System.out.println(rp.drive());
        System.out.println(rp.drinkAndDrive());
    }
}
