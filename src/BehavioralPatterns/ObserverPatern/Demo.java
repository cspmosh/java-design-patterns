package BehavioralPatterns.ObserverPatern;

public class Demo {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        Rat rat1 = new Rat(game);
        Rat rat2 = new Rat(game);
        System.out.println("Rat 1 attack: " + rat1.attack);
        Rat rat3 = new Rat(game);
        System.out.println("Rat 3 attack: " + rat3.attack);
        rat1.close();
        System.out.println("Rat 3 attack: " + rat3.attack);
    }
}
