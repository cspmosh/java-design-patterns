package BehavioralPatterns.TemplatePattern;

class Creature
{
    public int attack, health;

    public Creature(int attack, int health)
    {
        this.attack = attack;
        this.health = health;
    }
}

abstract class CardGame
{
    public Creature [] creatures;

    public CardGame(Creature[] creatures)
    {
        this.creatures = creatures;
    }

    // returns -1 if no clear winner (both alive or both dead)
    public int combat(int creature1, int creature2)
    {
        Creature first = creatures[creature1];
        Creature second = creatures[creature2];
        hit(first, second);
        hit(second, first);

        if (first.health == 0 && second.health == 0 || first.health > 0 && second.health > 0) return -1;

        return first.health > second.health ? creature1 : creature2;
    }

    // attacker hits other creature
    protected abstract void hit(Creature attacker, Creature other);
}

class TemporaryCardDamageGame extends CardGame
{

    public TemporaryCardDamageGame(Creature[] creatures){
        super(creatures);
    }

    @Override
    protected void hit(Creature attacker, Creature other) {
        if (attacker.attack >= other.health)
            other.health = 0;   // kill 'em dead
    }
}

class PermanentCardDamageGame extends CardGame
{

    public PermanentCardDamageGame(Creature[] creatures){
        super(creatures);
    }

    @Override
    protected void hit(Creature attacker, Creature other) {
        int damage = attacker.attack > other.health ? attacker.attack : other.health;
        other.health -= damage;
    }
}