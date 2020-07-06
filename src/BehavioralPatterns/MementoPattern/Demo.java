package BehavioralPatterns.MementoPattern;

public class Demo {
    public static void main(String[] args) {
        TokenMachine tm = new TokenMachine();
        System.out.println("Made a token with value 111 and kept a reference");
        Token token = new Token(111);
        System.out.println("Added this token to the list");
        tm.addToken(token);
        Memento m = tm.addToken(222);
        System.out.println("Changed this token's value to 333 :)");
        token.value = 333;
        System.out.println("token machine value: " + m.tokens.get(0).value);
        tm.revert(m);
        System.out.println("token machine value: " + m.tokens.get(0).value);
    }
}
