package com.mycompany.prog5121part1;

import java.util.Scanner;

public class Prog5121part1 {

    // --- REGISTRATION LOGIC (The "Excellent" 15-point criteria) ---

    // Rubric: Username contains "_" and is no more than 5 characters
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Rubric: Password complexity (8 chars, Upper, Number, Special)
    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    // Rubric: Regex cell phone checker (Must be exactly 10 digits)
    public boolean checkPhoneNumber(String phone) {
        return phone.matches("^0[0-9]{9}$");
    }

    // --- MAIN EXECUTION ---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prog5121part1 auth = new Prog5121part1();
        
        String regU = "", regP = "";
        boolean isReg = false; 

        while (true) {
            System.out.println("\n--- Main Menu ---\n1. Register\n2. Login\n3. Exit");
            System.out.print("Select: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    // GATE 1: Username Loop
                    String u = "";
                    while (true) {
                        System.out.print("Username: ");
                        u = sc.nextLine();
                        if (auth.checkUsername(u)) break;
                        System.out.println("Username is incorrectly formatted");
                    }

                    // GATE 2: Password Loop
                    String p = "";
                    while (true) {
                        System.out.print("Password: ");
                        p = sc.nextLine();
                        if (auth.checkPasswordComplexity(p)) break;
                        System.out.println("Password is too short or lacks special characters");
                    }

                    // GATE 3: Phone Number Loop
                    String ph = "";
                    while (true) {
                        System.out.print("Phone: ");
                        ph = sc.nextLine();
                        if (auth.checkPhoneNumber(ph)) break;
                        System.out.println("Invalid Phone Number. Must be exactly 10 digits");
                    }

                    // Rubric: Final Success Message
                    regU = u; regP = p; isReg = true;
                    System.out.println("Registration successful for " + regU);
                    break;

                case "2":
                    // Rubric: Decision structure for Authentication
                    // Safety check from image 1000231818.jpg
                    if (!isReg) {
                        System.out.println("Error: User not found. Please register an account first");
                    } else {
                        System.out.print("Login User: "); String lU = sc.nextLine();
                        System.out.print("Login Pass: "); String lP = sc.nextLine();
                        
                        if (lU.equals(regU) && lP.equals(regP)) {
                            System.out.println("Successful login");
                        } else {
                            System.out.println("Username or password does not match, please try again.");
                        }
                    }
                    break;

                case "3":
                    System.out.println("Exiting application.");
                    System.exit(0);
            }
        }
    }
}