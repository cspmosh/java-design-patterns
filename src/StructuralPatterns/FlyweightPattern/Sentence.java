package StructuralPatterns.FlyweightPattern;

import java.util.ArrayList;
import java.util.HashMap;

class Sentence
{

    private String[] words;
    private HashMap<Integer, WordToken> tokens = new HashMap<>();

    public Sentence(String plainText)
    {
        words = plainText.split(" ");
    }

    public WordToken getWord(int index)
    {
        WordToken wt = new WordToken();
        tokens.put(index, wt);
        return tokens.get(index);
    }

    @Override
    public String toString()
    {
        ArrayList<String> ws = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            if (tokens.containsKey(i) && tokens.get(i).capitalize){
                word = word.toUpperCase();
            }
            ws.add(word);
        }
        return String.join(" ", ws);
    }

    class WordToken
    {
        public boolean capitalize;

    }
}
