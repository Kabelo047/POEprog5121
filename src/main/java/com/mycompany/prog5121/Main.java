/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        System.out.println("=== Registration ===");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter SA cell number (+27XXXXXXXXX): ");
        String phone = input.nextLine();

        String registerMessage = login.registerUser(username, password, phone);
        System.out.println(registerMessage);

        if (!registerMessage.equals("User has been registered successfully.")) {
            return;
        }

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println("\n=== Login ===");

        System.out.print("Username: ");
        String loginUser = input.nextLine();

        System.out.print("Password: ");
        String loginPass = input.nextLine();

        boolean status = login.loginUser(loginUser, loginPass);

        System.out.println(login.returnLoginStatus(status, firstName, lastName));
    }
}
