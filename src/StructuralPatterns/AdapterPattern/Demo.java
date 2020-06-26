package StructuralPatterns.AdapterPattern;

// Getting the interface you want from the interface you have

public class Demo {
    public static void main(String[] args) {
        Square s = new Square(3);
        SquareToRectangleAdapter rect = new SquareToRectangleAdapter(s);
        System.out.println("width: " + rect.getWidth());
        System.out.println("height: " + rect.getHeight());
        System.out.println("area " + rect.getArea());
    }
}