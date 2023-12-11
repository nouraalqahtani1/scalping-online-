
import java.util.ArrayList;
import java.util.Scanner;

public class SignIN extends SignUP {

   static Scanner input = new Scanner(System.in);
    public SignIN(String userName, String password) {

    }

    public void Signin() {
        
        Scanner input = new Scanner(System.in);

        System.out.println("*** WELCOME TO SIGN IN PAGE ***");
        System.out.print("User name :");
        String userName = input.nextLine();
        System.out.print("Password :");
        String password = input.nextLine();

        varity_sign_in(userName, password);
    }

    public SignIN() {
    }

    // Method for vairty if the username and password enter are same with the sign in
    public void varity_sign_in(String username, String password) {
//        if (getUserName().equals(super.getUserName())&&getPassword().equals(super.getPassword())){
//            System.out.println("Sign in Successful !!");
//        }
//        else {
//            System.out.print("Sign in has failed , Invalid username or password !");
//        }

        if (username.equals(super.getUserName()) && password.equals(super.getPassword())) {
            System.out.println("Sign in Successful !!");
      Items();
        } else {
            System.out.print("Sign in has failed , Invalid username or password !");
        }
    }

//    public String getUsername() {
//      return userName;
//    }
//    
//    public String getpass() {
//      return password;
//    }
    
    static String Shopping_System = " *** Welcome in Scalping System*** "
            + "What do you want : \n "
            + " 1- Add item \n"
            + " 2- View item \n  "
            + " 3- Go to Your Profile \n"
            + " 4- View cart \n"
            + " 5- Exit \n "
            + "Your choice :\n ";
    private static double total_cart = 0.0;
    private static String total_item;
    static seller user = new seller();
    static void Items() {
        int choice;
        do {
            System.out.print(Shopping_System);
            choice = input.nextInt();
            switch (choice) {
                // add item option
                case 1:
                    
                   // input.nextLine();
                    System.out.println("Welcome to Add item Page :");
                    System.out.println("Did you read the policy of add item ?");
                    String x = input.next();
                    if (x.equals("Yes")) {
                        System.out.println("\t Please enter Name of item : ");
                        String name = input.next();
                        System.out.println("\t Please enter ID for item : ");
                        int Id = input.nextInt();
                        System.out.println("\t Please enter Duration of use the item :");
                        int duration = input.nextInt();
                        System.out.println("\t Please enter price of item :");
                        int price = input.nextInt();
                        user.addItems1(new Items(Id, duration, price, name));
                        //items1.add(new Items(Id, duration, price, name));
                    } else {
                        System.out.print("You Should read the policy before !");
                        // the method that go to policy 
                        profile Policy = new profile();
                        Policy.Policy();
                    }
                    break;
                // view item option
                case 2:

                    user.report();
                    break;
                // go to profile option
                case 3:
                    System.out.println("Welcome in Profile Page ");
                    break;
                // view cart option
                case 4:
                    System.out.println("** Shopping Cart **");
                    ShoppingCart it = new ShoppingCart();
                    it.displayCart();

                    System.out.println("Do you want to add item ?");
                    String y = input.nextLine();

                    if (y.equals("Yes")) {
                        it.addItem();
                        it.updateItem();
                    } else {
                        System.out.println("Total of cart :" + total_cart);
                        System.out.println("Total of item : " + total_item);
                        System.out.println("Add copon : ");
                        String copon = input.nextLine();
                        Payment payment = new Payment(total_cart);
                        payment.applyCopon(copon);
                        System.out.println("Select Type of payment you want  :");
                        System.out.println("1- credit card ");
                        System.out.println("2- Cash ");
                        System.out.println("Hint : Pay on cash = 17 SAR ");
                        System.out.print("Enter you favorite type ");
                        int a = input.nextInt();

                        if (a == 1) {

                            double totalCart;
                            CreditCard pay = new CreditCard();
                            pay.processOfCredit();

                        } else if (a == 2) {

                        }

                    }

                    break;

                case 5:
                    System.out.println("\t Thank you for your vist our system !!");
                    break;

                default:
                    System.out.println("\t Wrong input please enter vaild option !!");
                    break;
            }
        } while (choice != 5);

    }
}
