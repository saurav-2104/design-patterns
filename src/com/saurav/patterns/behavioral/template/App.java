package com.saurav.patterns.behavioral.template;

import java.util.logging.Logger;

/**
 * The Template method pattern:
 * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * Template Method lets subclasses redefine certain steps of an algorithm without letting them
 * to change the algorithm's structure.
 * Based on Inversion of Control aka Hollywood's Principle
 */

class Burger {
    private static String type;
    private static final Logger LOGGER = Logger.getLogger(Burger.class.getName());

    public Burger(String type) {
        this.type = type;
    }

    public void makeBurger() {
        bakeBuns();
        putPatty();
        insertToppings();
    }

    private void bakeBuns() {
        LOGGER.info("Buns baked !!");
    }

    private void putPatty() {
        if (type.equals("Veg")) {
            LOGGER.info("Aloo Patty inserted");
        } else if (type.equals("NonVeg")) {
            LOGGER.info("Chicken Patty inserted");
        }
    }

    private void insertToppings() {
        LOGGER.info("Onion and tomatoes have been inserted");
    }
}

public class App {
    public static void main(String[] args) {
        Burger vegBurger = new Burger("Veg");
        vegBurger.makeBurger();
        Burger nonVegBurger = new Burger("NonVeg");
        nonVegBurger.makeBurger();
    }
}
