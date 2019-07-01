package com.ferhat.lms;

import java.util.*;
import com.ferhat.controllers.AuthorController;
import com.ferhat.controllers.BookController;
import com.ferhat.controllers.PublisherController;
import com.ferhat.dao.DAO;

public class LMSMenu {

    public static Scanner keyboard;
    public static void printMenu() {

        keyboard = new Scanner(System.in);

        UserMenu.displayMainMenu();

        int choice = keyboard.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter the name of the author that you would like to add.");

                String userAuthorName = keyboard.next();

                System.out.println("Processing...");

                AuthorController.createNewAuthor(userAuthorName);
                break;
            }

            case 2: {
                System.out.println("Enter the author ID that you are trying to update.");

                int userAuthorId = keyboard.nextInt();

                System.out.println("Enter the Author Name.");

                String userAuthorName = keyboard.next();

                AuthorController.updateAuthor(userAuthorId, userAuthorName);

                System.out.println("Processing...");
                break;
            }

            case 3: {
                System.out.println("Enter the author ID that you are trying to delete.");

                int userAuthorID = keyboard.nextInt();

                AuthorController.deleteAuthor(userAuthorID);
                BookController.deleteBooksByAuthorPublisher(userAuthorID, 0);

                System.out.println("Processing...");
                break;
            }

            case 4: {
                System.out.println("Enter the author name to get their unique ID.");

                String userAuthorName = keyboard.next();

                System.out.println("Processing...");

                AuthorController.retrieveAuthor(userAuthorName);
                break;
            }

            case 5: {
                System.out.println("Enter the name of the publisher that you would like to add.");

                String userPublisherName = keyboard.next();

                System.out.println("Processing...");

                PublisherController.createNewPublisher(userPublisherName);
                break;
            }

            case 6: {
                System.out.println("Enter the publisherID that you would like to update.");

                int userPublisherID = keyboard.nextInt();

                System.out.println("Enter the new publisher name.");

                String userPublisherName = keyboard.next();

                PublisherController.updatePublisher(userPublisherID, userPublisherName);
                break;
            }

            case 7: {
                System.out.println("Enter the publisher ID that you would like to delete.");

                int userPublisherID = keyboard.nextInt();

                System.out.println("Processing...");

                PublisherController.deletePublisher(userPublisherID);
                BookController.deleteBooksByAuthorPublisher(0, userPublisherID);
                break;
            }

            case 8: {
                System.out.println("Enter the publisher name that you would like information on.");

                String userPublisherName = keyboard.next();

                System.out.println("Processing...");

                PublisherController.retrievePublisher(userPublisherName);
                break;
            }

            case 9: {
                System.out.println("Enter the following information to add a book to the LMS: ");

                System.out.print("Book ISBN: "); // add new line characters

                String userBookID = keyboard.next();

                System.out.print("Book Title: ");

                String userBookTitle = keyboard.next();

                System.out.print("AuthorID: ");

                int userAuthorID = keyboard.nextInt();

                System.out.print("PublisherID: ");

                int userPublisherID = keyboard.nextInt();

                System.out.println("Processing...");

                BookController.createNewBook(userBookID, userAuthorID, userPublisherID, userBookTitle);
                break;
            }

            case 10: {
                System.out.println("Enter the following information to modify a book in the LMS: ");

                System.out.print("Book ISBN: "); // add new line characters

                String userBookID = keyboard.next();

                System.out.print("Book Title: ");

                String userBookTitle = keyboard.next();

                System.out.print("AuthorID: ");

                int userAuthorID = keyboard.nextInt();

                System.out.print("PublisherID: ");

                int userPublisherID = keyboard.nextInt();

                System.out.println("Processing...");

                BookController.updateBook(userBookID, userAuthorID, userPublisherID, userBookTitle);
                break;
            }

            case 11: {
                System.out.println("Enter the book ISBN that you would like to delete.");

                String userBookID = keyboard.next();

                System.out.println("Processing...");

                BookController.deleteBook(userBookID);
                break;
            }

            case 12: {
                System.out.println("Enter the name of the book to get ISBN.");

                String userBookID = keyboard.next();

                System.out.println("Processing...");

                BookController.retrieveBook(userBookID);
                break;
            }

            case 13: {
                DAO.closeLMS();
                System.exit(0);
            }
        }
    }
}
