package com.problems.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

/*
Library Management System
Description: Develop a library management system:




Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/
public class LibraryExec {
    public static void main(String[] args) {
//        Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
        Book bk = new Book("Java" , "James Goslin" , 967485);
        Magazine mg = new Magazine("Java - Mag" , "James Goslin" , 967484);
        DVD dvd = new DVD("Java - DVD" , "James Goslin" , 967483);

        List<LibraryItem> lp = new ArrayList<>();
        lp.add(bk);
        lp.add(mg);
        lp.add(dvd);
        for (LibraryItem pd: lp) {
                System.out.println("Item id : " + pd.getItemDetails().getItemId());
                System.out.println("Title : " +pd.getItemDetails().getTitle());
                System.out.println("Authore : " + pd.getItemDetails().getAuthor());
                if(pd.checkAvailability()) {
                    pd.reserveItem();
                    System.out.println("Loan Duration : " + pd.getLoanDuration()+"\n");
                }
        }
    }
}
