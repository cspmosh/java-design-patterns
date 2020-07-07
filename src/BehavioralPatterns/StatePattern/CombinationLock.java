package BehavioralPatterns.StatePattern;

import java.util.Arrays;

class CombinationLock
{
    private int [] combination;
    public String status;

    public CombinationLock(int[] combination)
    {
        this.combination = combination;
        status = "LOCKED";
    }

    public void enterDigit(int digit)
    {
        if (status == "LOCKED" || status == "ERROR") {
            status = Integer.toString(digit);
        } else {
            status = status.concat(Integer.toString(digit));
        }
        if (status.length() == combination.length){
            String combo = Arrays.stream(combination)
                    .mapToObj(String::valueOf)
                    .reduce((a, b) -> a.concat(b))
                    .get();
            status = combo.equals(status) ? "OPEN" : "ERROR";
        }

    }
}
