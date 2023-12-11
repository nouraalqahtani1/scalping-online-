
import java.util.ArrayList;
import java.util.List;

public class Buyer {
    
    private List<String> cart;
    private List<String> purchaseHistory;
    private List<String> availableItems;
    private List<String>[] reviews;

    public Buyer(List<String> availableItems) {
        cart = new ArrayList<>();
        purchaseHistory = new ArrayList<>();
        this.availableItems = availableItems;
        reviews = new List[availableItems.size()];
        for (int i = 0; i < reviews.length; i++) {
            reviews[i] = new ArrayList<>();
        }
    }

    Buyer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addItem(String item) {
        cart.add(item);
        System.out.println(item + " added to the cart.");
    }

    public void viewAvailableItems() {
        System.out.println("Available Items:");
        for (String item : availableItems) {
            System.out.println(item);
        }
    }

    private void trackOrder(String order) {
        System.out.println("Order tracked: " + order);
    }

    public void viewReviews(String item) {
        int index = availableItems.indexOf(item);
        if (index != -1) {
            System.out.println("Reviews for " + item + ":");
            for (String review : reviews[index]) {
                System.out.println(review);
            }
        } else {
            System.out.println("No reviews available for " + item);
        }
    }

    private void viewPurchaseHistory() {
        System.out.println("Purchase History:");
        for (String item : purchaseHistory) {
            System.out.println(item);
        }
    }

    public void removeAD() {
        System.out.println("Advertisement removed.");
    }

    public void removeFromCart(String item) {
        if (cart.remove(item)) {
            System.out.println(item + " removed from the cart.");
        } else {
            System.out.println(item + " not found in the cart.");
        }
    }

    public void viewCart() {
        System.out.println("Shopping Cart:");
        for (String item : cart) {
            System.out.println(item);
        }
    }
}
