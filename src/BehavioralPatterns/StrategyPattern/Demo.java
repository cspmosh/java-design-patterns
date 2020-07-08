package BehavioralPatterns.StrategyPattern;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Demo {
    public static void main(String[] args) {
        DiscriminantStrategy strategy = new OrdinaryDiscriminantStrategy();
        QuadraticEquationSolver solver = new QuadraticEquationSolver(strategy);
        Pair<Complex, Complex> results = solver.solve(1, 10, 16);
        assertEquals(new Complex(-2, 0), results.first);
        assertEquals(new Complex(-8, 0), results.second);
    }
}
