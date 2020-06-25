package SingletonPattern;

import java.util.function.Supplier;

class SingletonTester
{
    public static boolean isSingleton(Supplier<Object> func)
    {
        return func.get() == func.get();
    }
}

class Singleton
{
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("Initializing singleton");
    }

    private static int val;

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
