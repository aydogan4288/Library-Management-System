package com.ferhat.controllers;

import com.ferhat.dao.DAO;
import com.ferhat.models.Publisher;
import java.util.ArrayList;

public class PublisherController {

    public static void createNewPublisher(String publisherName) {

        int publisherID;
        int lastIndex = DAO.publisherList.size() - 1;
        publisherID = DAO.publisherList.get(lastIndex).getpublisherID() + 1;
        Publisher newpublisher = new Publisher(publisherID, publisherName);
        DAO.publisherList.add(newpublisher);
        System.out.println("Added new publisher");
    }

    public static void retrievePublisher(String searchName) {
        int empty = 0;
        for ( int i = 0; i < DAO.publisherList.size(); i++) {
            if (DAO.publisherList.get(i).getpublisherName().equals(searchName)) {
                System.out.print(DAO.publisherList.get(i).getpublisherName() + "...uniqueID...");
                System.out.print(DAO.publisherList.get(i).getpublisherID());
                empty++;
            }
        }
        if (empty < 1) {
            System.out.println("publisher not found");
        }
    }

    public static void updatePublisher(int searchID, String publisherName) {
        int empty = 0;
        for (int i = 0; i < DAO.publisherList.size(); i++) {  // need the DAO.publisherList full name
            if (DAO.publisherList.get(i).getpublisherID() == searchID) {
                DAO.publisherList.get(i).setpublisherName(publisherName);
                System.out.println("publisher had been updated");
                empty++;
                break;
            }
        }
        if (empty < 1) {
            System.out.println("Please enter the correct publisherID");
        }
    }

    public static void deletePublisher(int searchID) {
        int empty = 0;
        for ( int i = 0; i < DAO.publisherList.size(); i++) {
            if (DAO.publisherList.get(i).getpublisherID() == searchID) {
                DAO.publisherList.remove(i);
                System.out.println("Removed publisher");
                empty++;
                break;
            }
        }
        if (empty < 1) {
            System.out.println("Please enter the correct publisherID to delete");
        }
    }
}
