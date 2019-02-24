package com.saurav.patterns.behavioral.strategy;

public interface FlyingBehaviour {
    void fly();
}

class FlyWithWings implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings.");
    }
}

class NoFly implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}