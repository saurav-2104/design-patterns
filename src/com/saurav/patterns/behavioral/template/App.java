package com.saurav.patterns.behavioral.template;

import java.util.logging.Logger;

/**
 * The Template method pattern:
 * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * Template Method lets subclasses redefine certain steps of an algorithm without letting them
 * to change the algorithm's structure.
 * Based on Inversion of Control aka Hollywood's Principle
 */

abstract class Burger {
    private static final Logger LOGGER = Logger.getLogger(Burger.class.getName());

    final void makeBurger() {
        bakeBuns();
        putPatty();
        insertToppings();
    }

    private void bakeBuns() {
        LOGGER.info("Buns baked !!");
    }

    abstract void putPatty();

    private void insertToppings() {
        LOGGER.info("Onion and tomatoes have been inserted");
    }
}

class VegBurger extends Burger {
    private static final Logger LOGGER = Logger.getLogger(VegBurger.class.getName());

    @Override
    void putPatty() {
        LOGGER.info("Aloo patty inserted");
    }
}

class NonVegBurger extends Burger {
    private static final Logger LOGGER = Logger.getLogger(NonVegBurger.class.getName());

    @Override
    void putPatty() {
        LOGGER.info("Chicken patty inserted");
    }
}

public class App {
    public static void main(String[] args) {
        Burger vegBurger = new VegBurger();
        vegBurger.makeBurger();
        Burger nonVegBurger = new NonVegBurger();
        nonVegBurger.makeBurger();
    }
}
