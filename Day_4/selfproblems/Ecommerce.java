package selfproblems;

/*
Problem 4: E-commerce Platform with Orders, Customers, and Products
Description: Design an e-commerce platform with Order, Customer, and Product classes. 
Model relationships where a Customer places an Order, and each Order contains multiple Product objects.
Goal: Show communication and object relationships by designing a system where customers communicate through orders, and orders aggregate products.
*/


class Product{
    private String productName;
    private int productPrice;
    public String getProductName(){
        return this.productName;
    }
    public int getProductPrice(){
        return this.productPrice;
    }
    Product(String productName, int productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
        System.out.println("Product created " + productName + " with price " + productPrice);
    }
}
class Order{
    private Product[] products;
    private int totalPrice;
    Order(Product[] products){
        this.products = products;
        for (Product p : products) {
            this.totalPrice += p.getProductPrice();
        }
        System.out.println("Order created with total price " + this.totalPrice);
    }
    public Product[] getProducts(){
        return this.products;
    }
}
class Customer{
    private String customerName;
    Customer(String customerName){
        this.customerName = customerName;
        System.out.println("Customer created " + this.customerName);
    }
    public void placeOrder(Order o){
    //    for(Product pd : o.getProducts()){}
        System.out.println("Placed Orders by " + this.customerName);
       
    }
}
public class Ecommerce{
    public static void main(String[] args){
        // Model relationships where a Customer places an Order, and each Order contains multiple Product objects.
        Customer c1 = new Customer("Saurabh");
        Customer c2 = new Customer("Nishant");
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Laptop 2", 60000);
        Product p3 = new Product("Laptop 3", 70000);
        Order o1 = new Order(new Product[]{p1, p2, p3});
        Order o2 = new Order(new Product[]{p1, p3});
        c1.placeOrder(o1);
        c1.placeOrder(o2);
        c2.placeOrder(o1);
        c2.placeOrder(o2);
    }
}