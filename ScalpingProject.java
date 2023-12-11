
import java.util.*;

public class ScalpingProject {

 static String main_Menu = "*** Welcome to Scalping System *** \n"
            + "choose from below: \n"
            + "1- SIGN UP \n"
            + "3- Exit \n";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(main_Menu);
        String choose = input.next();

        if (choose.equals("1")) {
            SignIN obSignIN = new SignIN();
            obSignIN.Sign_up();
            obSignIN.Signin();
        } else if (choose.equals("2")) {
            System.out.println("Me 2");
        } else {
            System.out.println("wrong input , Please enter any number of (1-2) ");
        }

    }

}
