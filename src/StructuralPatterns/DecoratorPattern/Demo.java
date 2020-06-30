package StructuralPatterns.DecoratorPattern;

public class Demo {
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.age = 1;
        System.out.println(bird.fly());

        Lizard lizard = new Lizard();
        lizard.age = 30;
        System.out.println(lizard.crawl());

        Dragon don = new Dragon();
        don.setAge(1);
        System.out.println(don.fly());
        System.out.println(don.crawl());
    }
}
