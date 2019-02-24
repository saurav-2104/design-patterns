package com.saurav.patterns.behavioral.strategy;


/**
 * Making the SimUDuck Application (Head First Design Patterns). SimUDuck display various kinds of duck species
 * making their intricate duck noises (quacking, of course).
 */

public class App {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.swim();

        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        redHeadDuck.swim();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

    }
}
