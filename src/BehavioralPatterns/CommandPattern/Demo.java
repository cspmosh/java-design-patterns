package BehavioralPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main (String[] args){
        Account a = new Account();

        List<Command> commands = List.of(
                new Command(Command.Action.DEPOSIT, 100),
                new Command(Command.Action.WITHDRAW, 1000)
        );

        // print the starting account balance
        System.out.println(a);

        for (Command c : commands){
            a.process(c);
            System.out.println(a);
        }
    }
}
