package StructuralPatterns.FlyweightPattern;

public class Demo {
    public static void main(String[] args){
        Sentence s = new Sentence("Make America great again!");

        Sentence.WordToken word = s.getWord(2);
        word.capitalize = true;
        System.out.println(s.toString());
    }
}
