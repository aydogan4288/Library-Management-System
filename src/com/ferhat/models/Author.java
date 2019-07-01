package com.ferhat.models;

public class Author {

    public Author() {}

    public Author(int ID, String Name) {
        this.ID = ID;
        this.name = Name;
    }

    private int ID = 0;
    private String name = "";

    public int getID() {
        return this.ID;
    }
    public void setID(int authorNewID) {
        this.ID = authorNewID;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }


}
