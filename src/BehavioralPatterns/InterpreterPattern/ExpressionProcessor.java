package BehavioralPatterns.InterpreterPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ExpressionProcessor
{
    public Map<Character, Integer> variables = new HashMap<>();

    public int calculate(String expression)
    {
        List<Token> tokens = new ArrayList<>();

        // separate into lexical tokens
        for (int i = 0; i < expression.length(); i++){
            switch (expression.charAt(i)){
                case '+':
                    tokens.add(new Token(Token.Type.PLUS, "+"));
                    break;
                case '-':
                    tokens.add(new Token(Token.Type.MINUS, "-"));
                    break;
                default:
                    Character c = expression.charAt(i);
                    if (Character.isAlphabetic(c)){
                        // it's a variable
                        if (i < expression.length() - 1 && Character.isAlphabetic(expression.charAt(i+1))) return 0;  // can't have variable longer than 1 character
                        if (!variables.containsKey(c)) return 0;    // variable doesn't exist
                        tokens.add(new Token(Token.Type.VARIABLE, variables.get(c).toString()));
                        break;
                    }
                    if (Character.isDigit(c)){
                        // it's a number
                        StringBuilder sb = new StringBuilder("" + c);
                        for (int j = i+1; j < expression.length(); j++){
                            if (Character.isDigit(expression.charAt(j))){
                                sb.append(expression.charAt(j));
                                i++;
                            } else {
                                break;
                            }
                        }
                        tokens.add(new Token(Token.Type.INTEGER, sb.toString()));
                        break;
                    }
            }
        }

        // evaluate the tokens
        Token left, operand, right;
        int result = 0;
        left = tokens.get(0);
        if (tokens.size() == 1) return Integer.parseInt(left.text);

        for (int i = 1; i < tokens.size(); i=i+2){
            operand = tokens.get(i);
            right = tokens.get(i+1);
            // do the math
            result = Evaluator.eval(left, operand, right);
            left = new Token(Token.Type.INTEGER, String.valueOf(result));
        }

        return result;
    }
}

class Evaluator {
    public static int eval(Token left, Token operand, Token right){
        switch (operand.type){
            case PLUS:
                return Integer.parseInt(left.text) + Integer.parseInt(right.text);
            case MINUS:
                return Integer.parseInt(left.text) - Integer.parseInt(right.text);
            default:
                return 0;
        }
    }
}

class Token {
    enum Type {
        INTEGER,
        PLUS,
        MINUS,
        VARIABLE
    }
    public Type type;
    public String text;

    public Token(Type type, String text){
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "`" + text + "`";
    }
}