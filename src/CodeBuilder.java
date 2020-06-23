import java.util.ArrayList;

public class CodeBuilder {

    private final String className;

    ArrayList<Field> fields = new ArrayList<>();
    String newLine = System.lineSeparator();

    public CodeBuilder(String className){
        this.className = className;
    }

    public CodeBuilder addField(String name, String type){
        fields.add(new Field(name, type));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("public class ");

        sb
                .append(className)
                .append(newLine)
                .append("{");

        for (Field f : fields) {
            sb
                    .append(newLine)
                    .append("  ")
                    .append(f.toString());
        }

        sb
                .append(newLine)
                .append("}");

        return sb.toString();
    }
}

class Field {
    private final String name;
    private final String type;

    public Field(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("public %s %s;", type, name);
    }
}