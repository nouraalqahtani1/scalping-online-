
public class Order {

    private long orderID;
    private String orderDate;
    private int choice;

    // Default constructor
    public Order() {
        orderID = 0;
        orderDate = "";
        choice = 0;
    }

    // Parameterized constructor
    public Order(long orderID, String orderDate, int choice) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.choice = choice;
    }

    // Method to track the order
    public void trackOrder() {
        System.out.println("Tracking order ID: " + orderID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: In Progress");
    }

    // Method to place an order based on the choice
    public boolean placeOrder(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Placing order for item 1");
                // Add your logic for placing the order for item 1
                return true;
            case 2:
                System.out.println("Placing order for item 2");
                // Add your logic for placing the order for item 2
                return true;
            default:
                System.out.println("Invalid choice. Order placement failed.");
                return false;
        }
    }


    

}
