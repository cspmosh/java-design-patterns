package StructuralPatterns.CompositePattern;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList<ValueContainer> collection = new ArrayList<>();

        ManyValues values = new ManyValues();
        values.add(1);
        values.add(17);

        collection.add(new SingleValue(1));
        collection.add(new SingleValue(13));
        collection.add(values);
        MyList list = new MyList(collection);

        System.out.println(list.sum());

    }
}
