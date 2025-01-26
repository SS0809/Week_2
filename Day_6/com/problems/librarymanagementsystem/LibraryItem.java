package com.problems.librarymanagementsystem;
//Use an abstract class LibraryItem with fields like itemId, title, and author.
public abstract class LibraryItem implements Reservable{

    boolean isAvailable = true; // default available
    int duration = 0;
    private int itemId;
    private String title;
    private String author;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
//    Add an abstract method getLoanDuration() and a concrete method getItemDetails().
    LibraryItem getItemDetails(){
        return this;
    }

    public abstract int getLoanDuration();
}
