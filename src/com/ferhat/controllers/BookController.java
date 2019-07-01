package com.ferhat.controllers;

import com.ferhat.dao.DAO;
import com.ferhat.models.Book;

import java.util.*;
import java.io.*;

public class BookController {

    public static void createNewBook(String bookID, int authorID, int publisherID, String bookName) { // need the DAO.bookList
        // full name
        // book id is ISBN
        Book newBook = new Book(bookID, authorID, publisherID, bookName);
        DAO.bookList.add(newBook);
        System.out.println("Added new book");
    }

    public static void retrieveBook(String searchName) {
        int empty = 0;
        for (int i = 0; i < DAO.bookList.size(); i++) {
            if (DAO.bookList.get(i).getName().equals(searchName)) {
                System.out.print(DAO.bookList.get(i).getName() +"  "+ DAO.bookList.get(i).getBookID() + "   ");
                System.out.print(DAO.bookList.get(i).getPublisherID());
                System.out.print("  ");
                System.out.print(DAO.bookList.get(i).getAuthorID());
                empty++;
            }
        }
        if (empty < 1) {
            System.out.println("Book not found");
        }
    }

    public static void updateBook(String searchID, int authorID, int publisherID, String bookName) {
        int empty = 0;
        for (int i = 0; i < DAO.bookList.size(); i++) { // need the DAO.bookList full name
            if (DAO.bookList.get(i).getBookID().equals(searchID)) {
                DAO.bookList.get(i).setAuthorID(authorID);
                DAO.bookList.get(i).setPublisherID(publisherID);
                DAO.bookList.get(i).setName(bookName);
                System.out.println("updated book");
                empty++;
                break;
            }
        }
        if (empty < 1) {
            System.out.println("Please enter the correct BookID");
        }

    }

    public static void deleteBook(String searchID) {
        int empty = 0;
        for (int i = 0; i < DAO.bookList.size(); i++) {
            if (DAO.bookList.get(i).getBookID().equals(searchID)) {
                DAO.bookList.remove(i);
                System.out.println("Removed book");
                empty++;
                break;
            }
        }
        if (empty < 1) {
            System.out.println("Please enter the correct BookID");
        }
    }

    public static void deleteBooksByAuthorPublisher(int authorID, int publisherID) {
        int authCount = 0;
        int pubCount = 0;
        for( int i = 0; i < DAO.bookList.size(); i++) {
            if ((DAO.bookList.get(i).getAuthorID() == authorID) && (authorID != 0)) {
                DAO.bookList.remove(i);
                authCount++;

            }
            if (DAO.bookList.get(i).getPublisherID() == publisherID && publisherID != 0) {
                DAO.bookList.remove(i);
                pubCount++;

            }
        }
        if(authCount > 0) {
            System.out.println("removed all books by authorID");
        }
        if(pubCount > 0) {
            System.out.println("removed all books by publisherID");
        }
    }

}

