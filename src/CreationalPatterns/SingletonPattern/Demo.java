package CreationalPatterns.SingletonPattern;

public class Demo {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        SingletonTester.isSingleton(() -> singleton);
        System.out.println(SingletonTester.isSingleton(() -> singleton2));
    }
}
