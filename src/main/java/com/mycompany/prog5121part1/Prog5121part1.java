package com.mycompany.prog5121part1;

import java.util.Scanner;

public class Prog5121part1 {

    // These two methods are what the Unit Test looks for
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    public static void main(String[] args) {
        Prog5121part1 app = new Prog5121part1();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Registration ---");
        System.out.print("Enter Username: ");
        String u = sc.nextLine();
        
        if (app.checkUsername(u)) {
            System.out.println("Username captured.");
        } else {
            System.out.println("Username format incorrect.");
        }
    }
}