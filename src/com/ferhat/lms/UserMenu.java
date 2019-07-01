package com.ferhat.lms;

public class UserMenu {

    public static String header = "Welcome to the Library Management System!";
    public static String divider = "------------------------------------------";
    public static void displayMainMenu() { //main menu

        System.out.println(header);

        System.out.println("Please choose an option from the following menu:");

        System.out.println(divider);

        System.out.println("1 - Add an author to the LMS.");
        System.out.println("2 - Modify an author in the LMS.");
        System.out.println("3 - Delete an author from the LMS.");
        System.out.println("4 - Find an author in the LMS.");

        System.out.println(divider);

        System.out.println("5 - Add a publisher to the LMS.");
        System.out.println("6 - Modify a publisher in the LMS.");
        System.out.println("7 - Delete a publisher from the LMS.");
        System.out.println("8 - Find a publisher in the LMS.");

        System.out.println(divider);

        System.out.println("9 - Add a book to the LMS.");
        System.out.println("10 - Modyify a book in the LMS.");
        System.out.println("11 - Delete a book from the LMS.");
        System.out.println("12 - Find a book in the LMS.");

        System.out.println(divider);

        System.out.println("13 - to quit program");

        System.out.println(divider);
    }
}