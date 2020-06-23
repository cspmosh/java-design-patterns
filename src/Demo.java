
public class Demo {
    public static void main(String[] args) {

        CodeBuilder cb = new CodeBuilder("Person");
        cb
            .addField("name", "String")
            .addField("age", "int");

        System.out.println(cb.toString());

    }
}
