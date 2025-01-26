package com.problems.ecommerce;

import java.util.ArrayList;
import java.util.List;

/*
 E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
*/
public class ECommerceSystem {
    public static void main(String[] args) {
        Groceries g = new Groceries("OIls" ,968574, 1560, 12, 15);
        Clothing c = new Clothing("Jeans" ,654987 ,1072, 8, 4);
        Electronics e = new Electronics("PowerBank" , 789456,1492, 15, 10);
        List<Product> lp = new ArrayList<>();
        lp.add(g);
        lp.add(c);
        lp.add(e);
        for (Product pd: lp) {
            if (pd instanceof Groceries) {
                Groceries ft = (Groceries) pd;// Down Cast
                ft.calculateTax();
                System.out.println("Groceries\nName : "+ft.getName()+ "\nProductId : "+ft.getProductId()+"\nDiscount : "+ft.getDiscount()+"\nDiscount calculateed : "+ ft.calculateDiscount()+"\nFinal Price are : "+ft.getTaxDetails()+"\n");
            }else if (pd instanceof Clothing) {
                Clothing ft = (Clothing) pd;// Down Cast
                ft.calculateTax();
                System.out.println("Clothing\nName : "+ft.getName()+ "\nProductId : "+ft.getProductId()+"\nDiscount : "+ft.getDiscount()+"\nDiscount calculateed : "+ ft.calculateDiscount()+"\nFinal Price are : "+ft.getTaxDetails()+"\n");
            }else {
                Electronics ft = (Electronics) pd;// Down Cast
                ft.calculateTax();
                System.out.println("Electronics\nName : "+ft.getName()+ "\nProductId : "+ft.getProductId()+"\nDiscount : "+ft.getDiscount()+"\nDiscount calculateed : "+ ft.calculateDiscount()+"\nFinal Price are : "+ft.getTaxDetails()+"\n");
            }
        }
    }

}
