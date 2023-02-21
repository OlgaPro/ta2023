package com.softserve.edu.hw5;

public class Drinks {
    enum Drincs {
        WATER("water"),
        COFFE("coffe"),
        WINE("wine");
        private String description;

        Drincs(String description) {
            this.description = description;
        }

        public String toString() {
            return "* toSting: " + description;
        }

        public String getDescription() {
            return "Description : "+ description;
        }
    }

    public static void main(String[] args) {
        Drincs drink = Drincs.WATER;
        System.out.println(drink.getDescription());

        for(Drinks.Drincs current : Drinks.Drincs.values()){
            System.out.println("Current " + current);
        }
    }
}
