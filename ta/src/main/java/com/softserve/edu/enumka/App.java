package com.softserve.edu.enumka;

public class App {
     enum Season{
        WINTER("winter"),
        SUMMER("summer"),
        SPIRING("spring"),
        AUTUMN("autumn");

        private String name;

        Season(String name) {
            this.name=name;
        }

       public String toString(){
            return "***toString() = " + name;
        }
        public Season nextSeason(){
            if (this == Season.WINTER)
                return SPIRING;
            return Season.SUMMER;
        }
    }

    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season.nextSeason().name);

        for(Season current : Season.values()){
            System.out.println("Current " + current);
        }
    }
}
