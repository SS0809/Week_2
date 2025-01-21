/*
Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
*/
public class Product{
    static int discount = 0;
    // Static:
    // A static variable discount shared by all products.
    // A static method updateDiscount() to modify the discount percentage.
    static int updateDiscount(int updatedDiscount){
        discount = updatedDiscount;
        return discount;
    }
    // This:
    // Use this to initialize productName, price, and quantity in the constructor.
    private String productName;
    private int price, quantity;
    // Final:
    // Use a final variable productID to ensure each product has a unique identifier that cannot be changed.  
    private final String productID;
    // Instanceof:
    // Validate whether an object is an instance of the Product class before processing its details.
    private void displayAccountDetails(){
        if(this instanceof Product){
            System.out.println("productName : " + productName);
            System.out.println("price : " + price);
            System.out.println("quantity : "+ quantity);
            System.out.println("productID : "+ productID);
        }
    }
    Product(String productName ,int price , int quantity , String productID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    public static void main(String[] args) {
        Product pt = new Product("Popcorn",40,2,"strefcscv");
        pt.displayAccountDetails();
    }
}