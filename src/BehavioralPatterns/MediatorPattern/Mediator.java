package BehavioralPatterns.MediatorPattern;

import java.util.ArrayList;

class Participant
{

    public int value = 0;
    private Mediator mediator;

    public Participant(Mediator mediator)
    {
        this.mediator = mediator;
        this.mediator.addParticipant(this);
    }

    public void say(int n)
    {
        mediator.broadcast(this, n);
    }

}

class Mediator
{
    ArrayList<Participant> participants = new ArrayList<>();

    public void broadcast(Participant source, int message){
        for (int i = 0; i < participants.size(); i++) {
            Participant p = participants.get(i);
            if (source != p){
               p.value = message;
            }
            System.out.print("Participant " + (i+1) + " value = " + p.value + ", ");
        }
        System.out.print(System.lineSeparator());
    }

    public void addParticipant(Participant p){
        participants.add(p);
    }
}