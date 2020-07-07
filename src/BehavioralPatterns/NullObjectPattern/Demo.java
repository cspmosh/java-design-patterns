package BehavioralPatterns.NullObjectPattern;

public class Demo  {
    public static void main(String[] args) throws Exception {
        NullLog log = new NullLog();
        Account acc = new Account(log);
        acc.someOperation();
    }
}
