package BehavioralPatterns.ChainOfResponsibilityPattern;

public class Demo {

    public static void main(String[] args) {
        Game game = new Game();
        Goblin goblin = new Goblin(game);
        Goblin goblin2 = new Goblin(game);
        Goblin goblin3 = new Goblin(game);
        GoblinKing goblinKing = new GoblinKing(game);

        game.creatures.add(goblin);
        System.out.println("Goblin enters play");
        System.out.println("Goblin: " + goblin);

        game.creatures.add(goblin2);
        System.out.println("Goblin2 enters play");
        System.out.println("Goblin: " + goblin);
        System.out.println("Goblin2: " + goblin2);

        game.creatures.add(goblin3);
        System.out.println("Goblin3 enters play");
        System.out.println("Goblin: " + goblin);
        System.out.println("Goblin2: " + goblin2);
        System.out.println("Goblin3: " + goblin3);

        game.creatures.add(goblinKing);
        System.out.println("Goblin King enters play");
        System.out.println("Goblin: " + goblin);
        System.out.println("Goblin2: " + goblin2);
        System.out.println("Goblin3: " + goblin3);
        System.out.println("GoblinKing: " + goblinKing);

        game.creatures.remove(goblinKing);
        System.out.println("Globin King removed from play");
        System.out.println("Goblin: " + goblin);
        System.out.println("Goblin2: " + goblin2);
        System.out.println("Goblin3: " + goblin3);
    }

}
