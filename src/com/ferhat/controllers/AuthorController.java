package com.ferhat.controllers;

import com.ferhat.dao.DAO;
import com.ferhat.models.Author;

import java.util.ArrayList;

public class AuthorController {

    public static void createNewAuthor(String authorName) { // need the DAO.authorList full name

        int authorID;
        int lastIndex = DAO.authorList.size() - 1;
        authorID = DAO.authorList.get(lastIndex).getID() + 1;
        Author newAuthor = new Author(authorID, authorName);
        DAO.authorList.add(newAuthor);
        System.out.println("Author has been created.");

    }

    public static void retrieveAuthor(String searchName) {

        int empty = 0;
        for ( int i = 0; i < DAO.authorList.size(); i++) {
            if (DAO.authorList.get(i).getName().equals(searchName)) {
                System.out.print(DAO.authorList.get(i).getName() + "...uniqueID...");
                System.out.print(DAO.authorList.get(i).getID());
                empty++;
            }
        }
        if (empty < 1) {
            System.out.println("Author not found");
        }
    }

    public static void updateAuthor(int searchID, String AuthorName) {
        int empty = 0;
        for ( int i = 0; i < DAO.authorList.size(); i++) {
            if (DAO.authorList.get(i).getID() == searchID) {
                DAO.authorList.get(i).setName(AuthorName);
                System.out.println("Author has been updated.");
                empty++;
                break;
            }
        }
        if (empty < 1) {
            System.out.println("Please enter the correct authorID");
        }

    }

    public static void deleteAuthor(int searchID) {
        int empty = 0;
        for ( int i = 0; i < DAO.authorList.size(); i++) {
            if (DAO.authorList.get(i).getID() == searchID) {
                DAO.authorList.remove(i);
                System.out.println("Removed author");
                empty++;
                break;
            }
        }
        if (empty < 1) {
            System.out.println("Please enter the correct authorID to delete");
        }
    }
}