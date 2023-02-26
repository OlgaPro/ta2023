package com.softserve.edu.hw6;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product("Coffe", 80);
        Product p2 = new Product("Coffe", 80);
        Product p3 = new Product("Bread", 20);
        if(p1.equals(p2)){
            System.out.println();
        }
        System.out.println(p2.equals(p3));

    }
}
