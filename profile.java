
import java.util.Scanner;

public class profile extends address {

    String WishList[];
    Scanner input = new Scanner(System.in);
    address addresss = new address();
    //constructor 

    public profile(String street, int streetNumber, int buildingNumber, String city, String phoneNumber) {
        super(street, streetNumber, buildingNumber, city, phoneNumber);
    }

    profile() {

    }

    public void WishList() {
        int wishlistcounter = 100;
        int choice = 0;

        System.out.print("Welcome to wishes page");
        System.out.print("Enter 1 to add to the list"
                + "Enter 2 to remove from the list"
                + "Enter 3 to display wish list");

        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        switch (choice) {
            case 1:

                System.out.println("Add to wish list :");
                for (int i = 0; i < wishlistcounter; i++) {
                    System.out.println(WishList[i]);
                }
                break;
            case 2:

                System.out.println("remove from wish list :");
                for (int i = 0; i < wishlistcounter; i--) {
                    System.out.println(WishList[i]);
                }

                break;
            case 3:

                System.out.println("All Wish list" + WishList);

                break;

            default:
                System.out.println("Wrong choice");

        }

    }

    //methods 
    public void EditProfile() {
        System.out.print("Edit name");
        String userName = input.nextLine();
        System.out.print("Edit Password :");
        String password = input.nextLine();

    }

    public void address() {
        String street1 = addresss.getStreet();
        int streetnum = addresss.getStreetNumber();
        int building = addresss.getbuildingNum();
        String city = addresss.getCity();
        String phone = addresss.getPhone();
    }

    public void Policy() {

        System.out.print("• There must be credibility in setting product specifications.\n"
                + "• The product must be free of defects.\n"
                + "• Provide clear pictures and product descriptions that match reality.\n"
                + "• The duration of use of the product did not exceed one year.\n"
                + "• The duration of use of the product does not exceed 3 uses.\n"
                + "• Payment before receipt.");

    }

}
