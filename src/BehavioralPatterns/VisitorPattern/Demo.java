package BehavioralPatterns.VisitorPattern;

public class Demo {
    public static void main(String[] args) {
        AdditionExpression ae = new AdditionExpression(
                new Value(3),
                new MultiplicationExpression(
                        new Value(3),
                        new Value(5)
                )
        );
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(ae);
        System.out.println(ep);
    }
}
