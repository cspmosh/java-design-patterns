package BehavioralPatterns.IteratorPattern;

import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {
        Node<Character> node = new Node<>('a',
                new Node<>('b',
                        new Node<>('c'),
                        new Node<>('d')),
                new Node<>('e'));
        StringBuilder sb = new StringBuilder();
        Iterator<Node<Character>> it = node.preOrder();
        while (it.hasNext())
        {
            sb.append(it.next().value);
        }

        System.out.println(sb.toString());
    }

}
