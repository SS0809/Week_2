import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private HashMap<String, Item> cart;

    // Inner class to represent an item in the cart
    private class Item {
        String itemName;
        double price;
        int quantity;

        Item(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        double getTotalPrice() {
            return price * quantity;
        }
    }

    // Constructor for ShoppingCart
    public ShoppingCart() {
        cart = new HashMap<>();
    }

    // Add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (cart.containsKey(itemName)) {
            Item existingItem = cart.get(itemName);
            existingItem.quantity += quantity; // Update the quantity
            System.out.println(quantity + " more of " + itemName + " added to the cart.");
        } else {
            cart.put(itemName, new Item(itemName, price, quantity));
            System.out.println(itemName + " added to the cart.");
        }
    }

    // Remove an item from the cart
    public void removeItem(String itemName) {
        if (cart.containsKey(itemName)) {
            cart.remove(itemName);
            System.out.println(itemName + " removed from the cart.");
        } else {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Display the total cost of items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (Item item : cart.values()) {
            totalCost += item.getTotalPrice();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Display all items in the cart
    public void displayCartItems() {
        if (cart.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (Map.Entry<String, Item> entry : cart.entrySet()) {
                Item item = entry.getValue();
                System.out.println(item.itemName + " - Quantity: " + item.quantity + ", Price: $" + item.price + ", Total: $" + item.getTotalPrice());
            }
        }
    }

    // Main method to test the ShoppingCart
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Laptop", 1000.00, 1);
        cart.addItem("Headphones", 50.00, 2);
        cart.addItem("Mouse", 25.00, 3);

        // Display the cart
        cart.displayCartItems();

        // Add more of an existing item
        cart.addItem("Mouse", 25.00, 2);

        // Remove an item
        cart.removeItem("Headphones");

        // Display the total cost
        cart.displayTotalCost();

        // Display the updated cart
        cart.displayCartItems();
    }
}
