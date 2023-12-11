
import java.time.LocalDate;

public class Items {

    String NameOfItem;
    int ItemID;
    int DurtionOfUse;
    int ItemPrice;

    //  Defult constractour 
    public Items() {

        ItemID = 0;
        DurtionOfUse = 0;
        ItemPrice = 0;
        this.NameOfItem = "";

    }
    // Parameterize constrctur 

    public Items(int iD, int DurtionOfUsee, int ItemPricee, String NameOfItem) {

        ItemID = iD;
        DurtionOfUse = DurtionOfUsee;
        ItemPrice = ItemPricee;
        this.NameOfItem = NameOfItem;

    }
    //Get

    public int getItemID() {
        return ItemID;
    }

    public String getNameOfItem() {
        return NameOfItem;
    }

    public int getDurtionOfUse() {
        return DurtionOfUse;
    }

    public int getItemPrice() {
        return ItemPrice;
    }

    //Set
    public void setItemID(int iD) {
        ItemID = iD;
    }

    public void setNameOfItem(String getNameOfItem) {
        this.NameOfItem = NameOfItem;
    }
}
