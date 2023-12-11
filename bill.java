    
    public class bill extends ShoppingCart { 
    public double total; 
    public int numOfItem; 
    private String location; 
    public bill(double total, int numOfItem, String location) { 
        this.total = total; 
        this.numOfItem = numOfItem; 
        this.location = location; 
    } 
    public void printBill() { 
        System.out.println("Total: $" + total); 
        System.out.println("Number of Items: " + numOfItem); 
        System.out.println("Location: " + location); 
    } 
     
 
 
}
