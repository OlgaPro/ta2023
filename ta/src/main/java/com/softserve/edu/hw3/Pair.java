package com.softserve.edu.hw3;

public class Pair {
    String pat;
    int year;
    private String name;

    public Pair(){
        pat = "Dog";
        year = 6;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
