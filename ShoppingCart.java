
 import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
  
    
private Map<Items, Integer> items; // Map to store items and their quantities
private int total_item;
double total_cart;

    // Default constructor for ShoppingCart
    public ShoppingCart() {
        this.items = new HashMap<>();
        this.total_item = 0;
        this.total_cart = 0.0;
    }

    // Method to add an item to the cart
    public void addItem(Items product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
        total_item += quantity;
        total_cart += product.getItemPrice() * quantity;
        System.out.println("Added " + quantity + " " + product.getNameOfItem() + "(s) to the shopping cart.");
    }

    // Method to update the quantity of an item in the cart
    public void updateItem(Items product, int newQuantity) {
        if (items.containsKey(product)) {
            total_item = total_item - items.get(product) + newQuantity;
            total_cart = total_cart - product.getItemPrice() * items.get(product) + product.getItemPrice() * newQuantity;

            items.put(product, newQuantity);
            System.out.println("Updated quantity of " + product.getNameOfItem() + " to " + newQuantity + ".");
        } else {
            System.out.println(product.getNameOfItem() + " not found in the shopping cart.");
        }
    }

    // Method to get the total number of items in the cart
    public int getTotalItems() {
        return total_item;
    }

    // Method to get the total value of the items in the cart
    public double getTotalCart() {
        return total_cart;
    }

    // Method to display the contents of the cart
    public void displayCart() {
        System.out.println("Shopping Cart Contents:");
        for (Map.Entry<Items, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey().getNameOfItem() + " - Quantity: " + entry.getValue() + " - $" + entry.getKey().getItemPrice() * entry.getValue());
        }
        System.out.println("Total Items: " + getTotalItems());
        System.out.println("Total Cart Value: $" + getTotalCart());
    }

    void addItem() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void updateItem() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


   
}
