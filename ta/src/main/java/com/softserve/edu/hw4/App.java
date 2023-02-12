package com.softserve.edu.hw4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int temp = 0;

        System.out.println("How many numbers do you want to compare: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] mass = new int [n];

        System.out.println("Enter " + n + " numbers via Enter: ");
        for(int i=0; i<mass.length; i++){
            mass[i] = sc.nextInt();
        }

        for (int i=0; i<mass.length; i++){
            for(int j=i+1; j<mass.length; j++){
                if(mass[i]>mass[j]){
                    temp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
                //
            }
        }
        for (int i=0;i<mass.length;i++)
            System.out.print(mass[i]+" ");
    }
}
