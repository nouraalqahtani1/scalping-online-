
import java.util.ArrayList; 
import java.util.Iterator; 
 
public class seller extends Items { 
    public String name; 
    public String email; 
    public int age; 
    public int id; 
    public ArrayList<Items> items = new ArrayList<Items>();; //Item is class 
    String iName; 
    int iID; 
    int iDuration; 
    int iPrice; 
 
    public seller(String name, String email, int age, int id) { 
        //super(iName, iID, iDuration, iPrice); 
        this.iName=NameOfItem; 
        this.iID=ItemID; 
        this.iDuration=DurtionOfUse; 
        this.iPrice=ItemPrice; 
        this.name = name; 
        this.email = email; 
        this.age = age; 
        this.id = id; 
        this.items = new ArrayList<>(); 
    } 

    seller() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    public void addItems(Items[] itemsToAdd) { //Item is class 
        for (Items item : itemsToAdd) { 
            this.items.add(item); 
        } 
        System.out.println("Items added successfully."); 
    } 
     
    public void removeItems(String itemToRemove) { //Item is class 
        Iterator<Items> iterator = items.iterator(); 
        while (iterator.hasNext()) { 
            Items item = iterator.next(); 
            if (getNameOfItem().equals(itemToRemove)) { 
                iterator.remove(); 
                System.out.println("Item '" + itemToRemove + "' deleted successfully."); 
                return; 
            } 
        } 
        System.out.println("Item '" + itemToRemove + "' not found."); 
    } 
     
    
     
    public void report() { 
        System.out.println("Seller Report:"); 
        System.out.println("Name: " + this.name); 
        System.out.println("Email: " + this.email); 
        System.out.println("Age: " + this.age); 
        System.out.println("ID: " + this.id); 
        System.out.println( 
                "Items:"); 
//        for (Items item : this.items) { //Item is class 
//            System.out.println("  - " + super.NameOfItem + ": $" + super.ItemID + " "+ super.DurtionOfUse + " "+super.ItemPrice); //Items class details refered to the seller 
//        } 

 System.out.println("\t *** Here all item in the Sytem ***");
                    System.out.println("Item ID \t Item Name \t item Price \t item duration");
//                    Buyer buyer = new Buyer();
//                    buyer.viewAvailableItems();
                    for (int i = 0; i < items.size() ; i++) {
                        System.out.println(items.get(i).ItemID + " \t\t " + items.get(i).NameOfItem + " \t\t " + items.get(i).ItemPrice + " \t\t " + items.get(i).DurtionOfUse + " \t \t");
                    }
    } 

//    void addItems() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
     
     public void addItems1(Items itemsToAdd) { //Item is class 
//        for (Items item : itemsToAdd) { 
//            this.items.add(item); 
//        } 
      this.items.add(itemsToAdd); 
        
      //  this.items.add(new Items(1, 1, 1, "ABC"));
        System.out.println("Items added successfully."); 
    } 
     
}