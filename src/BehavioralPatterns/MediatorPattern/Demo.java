package BehavioralPatterns.MediatorPattern;

public class Demo {
    public static void main(String[] args) {

        Mediator God = new Mediator();

        Participant John = new Participant(God);
        Participant Jane = new Participant(God);

        John.say(3);
        Jane.say(2);
    }
}
