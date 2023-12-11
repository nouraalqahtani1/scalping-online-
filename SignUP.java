
import java.util.Scanner;

public class SignUP {

    String userName;
    String password;
    private String passewordConfirm;
    private String emails;
    private String phoneNumber;

    public SignUP(String userName, String password, String passewordConfirm, String emails, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.passewordConfirm = passewordConfirm;
        this.emails = emails;
        this.phoneNumber = phoneNumber;
    }

    public SignUP() {

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void Sign_up() {
        Scanner input = new Scanner(System.in);

        System.out.println("*** WELCOME TO SIGN UP PAGE ***");
        System.out.print("User name :");
        userName = input.nextLine();
        System.out.print("Email :");
        emails = input.nextLine();
        System.out.print("Phone Number :");
        phoneNumber = input.nextLine();
        System.out.print("Password :");
        String entpassword = input.nextLine();
        System.out.print("Password Confirm  :");
        passewordConfirm = input.nextLine();

        if (!entpassword.equals(passewordConfirm)) {
            System.out.print("Error , Password are not same please try again !");
            return;
        }
        password = entpassword;
        System.out.print("Sign up Successdul !");
        
        System.out.println("ABC:" + getUserName());

    }

    public String getPassewordConfirm() {
        return passewordConfirm;
    }

    public String getEmails() {
        return emails;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
