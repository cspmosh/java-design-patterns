package BehavioralPatterns.StatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        CombinationLock lock = new CombinationLock(new int[]{5,5,5,5});

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Boolean parseOK = false;
        String input = "";
        int digit = 0;

        while (true) {

            try {
                parseOK = false;
                do {
                    System.out.println("Please enter a digit from 0 to 9");
                    input = console.readLine();
                    try {
                        digit = Integer.parseInt(input);
                        if (input.length() == 1) parseOK = true;
                    } catch (NumberFormatException error){ }
                } while (!parseOK);
                lock.enterDigit(digit);
                System.out.println(lock.status);
                if (lock.status == "ERROR" || lock.status == "OPEN") break;
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
