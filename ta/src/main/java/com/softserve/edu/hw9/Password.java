package com.softserve.edu.hw9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%]).{12,}";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        if (password.matches(pattern)) {
            System.out.println("Password passed");
        }
        else {
            System.out.println("Password failed");
        }
    }
}
