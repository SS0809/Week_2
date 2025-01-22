package diagrams;

/*
Sample Problem 2: Grocery Store Bill Generation Application
Class Diagram
The class diagram models the system where a customer buys products, and the bill is generated.
Diagram Description:
Classes: Customer, Product, BillGenerator
Relationships:
A Customer can purchase multiple Product items (Composition).
BillGenerator computes the total for the Customer.



Object Diagram
An object diagram shows the details of a Customer and the Product objects they have purchased.
Example:
Customer: Alice
Products:
Apples (2 kg at $3 per kg)
Milk (1 liter at $2 per liter)


Sequence Diagram
The sequence diagram shows the process of bill generation for a customer.
Scenario: A customer checks out at the grocery store, and the total bill is generated.
Actors:
Customer
BillGenerator
→ Draw the Sequence Diagram

*/
import java.util.ArrayList;
import java.util.List;

class Customer{
    public String name;
    private List<Product> products;

    public Customer(String name){
        this.name = name;
        products = new ArrayList<>();
    }

    public void purchaseProduct(Product product){
        products.add(product);
    }
    public List<Product> getPurchasedProducts() {
        return products;
    }
}
class Product{
    public String name;
    public int quantity;
    public double price;

    public Product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

class BillGenerator{
    public double generateBill(Customer customer) {
        double total = 0;
        System.out.println("Bill for " + customer.name + ":");
        for (Product product : customer.getPurchasedProducts()) {
            double productTotal = product.price;
            System.out.println("- " + product.name + " = $" + productTotal);
            total += productTotal;
        }
        System.out.println("\nTotal: $" + total);
        return total;
    }
}

public class GroceryMain{
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        
        Product p1 = new Product("Apples", 2, 3);
        Product p2 = new Product("Milk", 1, 2);

        c1.purchaseProduct(p1);
        c1.purchaseProduct(p2);

        BillGenerator bill = new BillGenerator();
        bill.generateBill(c1);
    }
}