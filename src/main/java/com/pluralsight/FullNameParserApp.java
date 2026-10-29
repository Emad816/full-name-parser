package com.pluralsight;

import java.util.Scanner;

public class FullNameParserApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        String[] parts = fullName.split(" ");

        String firstName;
        String middleName;
        String lastName;

        if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            firstName = parts[0];
            middleName = "(none)";
            lastName = parts[1];
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
