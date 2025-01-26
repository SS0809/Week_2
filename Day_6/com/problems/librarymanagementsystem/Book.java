package com.problems.librarymanagementsystem;

//Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
public class Book extends LibraryItem{
    Book(String title , String author , int itemId){
        super.setAuthor(author);
        super.setItemId(itemId);
        super.setTitle(title);
    }
    @Override
    public void reserveItem(){
        if(checkAvailability()){
            this.setAvailable(false);
            this.setDuration(15);
            System.out.println("Item reserved for 15 days");
        }
    }

    @Override
    public boolean checkAvailability() {
        return (this.getIsAvailable());
    }
    @Override
    public int getLoanDuration(){
        return this.getDuration();
    }
}
