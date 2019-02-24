package com.saurav.patterns.behavioral.strategy;


/**
 * Making the SimUDuck Application (Head First Design Patterns). SimUDuck display various kinds of duck species
 * making their intricate duck noises (quacking, of course).
 */

abstract class Duck {
    void swim() {
        System.out.println("I am swimming !!");
    }

    void quack() {
        System.out.println("Quack Quack !!");
    }

    void fly() {
        System.out.println("I am flying !!");
    }

    abstract void display();
}

class MallardDuck extends Duck {
    void display() {
        System.out.println("Mallard Duck on the display");
    }
}

class RedHeadDuck extends Duck {
    void display() {
        System.out.println("Red Head Duck on the display");
    }
}

class RubberDuck extends Duck {
    void display() {
        System.out.println("Rubber Duck on the display");
    }

    @Override
    void quack() {
        // How can a rubber duck quack ? It should "squeak"
        System.out.println("Squeak Squeak !");
    }

    @Override
    void fly() {
        // Rubber ducks cannot fly !
    }
}

public class App {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.swim();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();

    }
}
