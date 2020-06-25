package PrototypePattern;

public class Demo {

    public static void main(String[] args) {
        Line l = new Line(new Point(0,0), new Point(2,2));
        Line l2 = l.deepCopy();
        l2.start.x = 1;
        l2.start.y = 1;
        System.out.println(l);
        System.out.println(l2);
    }
}
