package BehavioralPatterns.InterpreterPattern;

public class Demo {
    public static void main(String[] args) {
        ExpressionProcessor proc = new ExpressionProcessor();
        proc.variables.put('x',5);
        System.out.println(proc.calculate("1"));
        System.out.println(proc.calculate("1+2"));
        System.out.println(proc.calculate("1+x"));
        System.out.println(proc.calculate("1+xy"));
    }
}
