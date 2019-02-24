package com.saurav.patterns.behavioral.strategy;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackingBehaviour quackingBehaviour;

    // I do not know a single duck that is afraid of water.
    void swim() {
        System.out.println("I am swimming !!");
    }

    abstract void display();

    void performFly() {
        flyingBehaviour.fly();
    }

    void performQuack() {
        quackingBehaviour.quack();
    }
}

class MallardDuck extends Duck {
    public MallardDuck() {
        flyingBehaviour = new FlyWithWings();
        quackingBehaviour = new Quack();
    }

    void display() {
        System.out.println("Mallard Duck on the display");
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyingBehaviour = new FlyWithWings();
        quackingBehaviour = new Quack();
    }

    void display() {
        System.out.println("Red Head Duck on the display");
    }
}

class RubberDuck extends Duck {
    public RubberDuck() {
        flyingBehaviour = new NoFly();
        quackingBehaviour = new Squeak();
    }

    void display() {
        System.out.println("Rubber Duck on the display");
    }
}