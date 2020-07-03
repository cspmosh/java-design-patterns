package BehavioralPatterns.CommandPattern;

class Command
{
    enum Action
    {
        DEPOSIT, WITHDRAW
    }

    public Action action;
    public int amount;
    public boolean success;

    public Command(Action action, int amount)
    {
        this.action = action;
        this.amount = amount;
    }
}

class Account
{
    public int balance;

    public void process(Command c)
    {
        switch (c.action){
            case DEPOSIT:
                System.out.println(c.action + " " + c.amount);
                balance = balance + c.amount;
                c.success = true;
                break;
            case WITHDRAW:
                System.out.println(c.action + " " + c.amount);
                int total = balance - c.amount;
                if (total >= 0) {
                    balance = total;
                    c.success = true;
                } else {
                    System.out.println("Unable to " + c.action + " " + c.amount + " because the account only has " + balance + " in it");
                    c.success = false;
                }
                break;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
