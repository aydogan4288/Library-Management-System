package com.ferhat;

import com.ferhat.dao.DAO;
import com.ferhat.lms.LMSMenu;
import com.ferhat.lms.UserMenu;

public class Main {

    public static void main(String[] args) {

        DAO reader = new DAO();
        reader.daoReader();
        while(true){
            LMSMenu.printMenu();
        }

    }
}
