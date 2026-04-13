package com.chatapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        System.out.println("=== REGISTER ===");

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        System.out.print("Enter Cellphone (+27...): ");
        String cell = input.nextLine();

        String registrationMessage = login.registerUser(username, password, cell);
        System.out.println(registrationMessage);

        if (!registrationMessage.equals("User registered successfully.")) {
            return;
        }

        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter Username: ");
        String loginUser = input.nextLine();

        System.out.print("Enter Password: ");
        String loginPass = input.nextLine();

        boolean success = login.loginUser(loginUser, loginPass);

        System.out.println(login.returnLoginStatus(success, "Thabiso", "Nkosi"));
    }
}