package BehavioralPatterns.TemplatePattern;

import static junit.framework.TestCase.assertEquals;

public class Demo {
    public static void main(String[] args) {
        Creature c1 = new Creature(1, 1);
        Creature c2 = new Creature(2, 2);
        TemporaryCardDamageGame game = new TemporaryCardDamageGame(new Creature[]{c1, c2});
        assertEquals(1, game.combat(0,1));
    }
}
