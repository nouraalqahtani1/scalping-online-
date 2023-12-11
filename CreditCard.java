 import java.util.Scanner;



public class CreditCard extends Payment {
private String cardNumber ;
private String cardName ;
private String bankName ;
private String expDate ;
private String cvcNumber ;


 
public CreditCard (){
    
}
public CreditCard ( double total_cart, String cardNumber, String cardName, String bankName, String expDate, String cvcNumber)  {
super(total_cart);
this.bankName = bankName;
this.cardNumber = cardNumber;
this.cardName = cardName ;
this.expDate = expDate ;
this.cvcNumber = cvcNumber ;
}

    
public void processOfCredit (){
    Scanner input = new Scanner(System.in);
    System.out.println("Bank Name :");
    bankName = input.nextLine();
    System.out.println("Your Name in Credit card :");
    cardName = input.nextLine();
    System.out.println("Card Number :");
    cardNumber = input.nextLine();
    System.out.println("Exp Date :");
    expDate = input.nextLine();
    System.out.println("CVC Number :");
    cvcNumber = input.nextLine();
    System.out.println("YOUR PAY HAS SUCESSFUL !!");
}


    

}
