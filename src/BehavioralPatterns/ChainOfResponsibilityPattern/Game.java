package BehavioralPatterns.ChainOfResponsibilityPattern;

import java.util.ArrayList;
import java.util.List;


abstract class Creature
{
    protected Game game;
    protected int baseAttack, baseDefense;

    public Creature(Game game, int baseAttack, int baseDefense) {
        this.game = game;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }

    public abstract int getAttack();
    public abstract int getDefense();
    public abstract void query(Object source, StatQuery sq);
}

class Goblin extends Creature
{

    protected Goblin(Game game, int baseAttack, int baseDefense){
        super(game, baseAttack, baseDefense);
    }

    public Goblin(Game game)
    {
        super(game, 1, 1);
    }

    @Override
    public int getAttack()
    {
        StatQuery q = new StatQuery(Statistic.ATTACK);
        for (Creature c : game.creatures){
            c.query(this, q);
        }
        return q.result;
    }

    @Override
    public int getDefense()
    {
        StatQuery q = new StatQuery(Statistic.DEFENSE);
        for (Creature c : game.creatures) {
            c.query(this, q);
        }
        return q.result;
    }

    @Override
    public void query(Object source, StatQuery sq) {
        if (source == this) {
            switch (sq.statistic) {
                case ATTACK:
                    sq.result += baseAttack;
                    break;
                case DEFENSE:
                    sq.result += baseDefense;
                    break;
            }
        } else {
            if (sq.statistic == Statistic.DEFENSE) {
                sq.result ++;
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
                "Attack=" + getAttack() +
                ", Defense=" + getDefense() +
                '}';
    }
}

class GoblinKing extends Goblin
{
    public GoblinKing(Game game)
    {
        super(game, 3, 3);
    }

    @Override
    public void query(Object source, StatQuery sq) {
        if (source == this) {
            super.query(source, sq);
        } else {
            sq.result ++;
        }
    }
}

enum Statistic
{
    ATTACK, DEFENSE
}

class Game
{
    public List<Creature> creatures = new ArrayList<>();
}

class StatQuery {
    public Statistic statistic;
    public int result;

    public StatQuery(Statistic statistic){
        this.statistic = statistic;
    }
}



