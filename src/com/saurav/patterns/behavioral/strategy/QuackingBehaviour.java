package com.saurav.patterns.behavioral.strategy;

public interface QuackingBehaviour {
    void quack();
}

class Quack implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack Quack !");
    }
}

class Mute implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}

class Squeak implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak !");
    }
}