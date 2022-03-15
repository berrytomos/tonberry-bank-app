package Interface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Registration {
    private String accountNumber;
    private static String username;
    private static String password;
    private String loginUser;
    private String loginPass;

    Scanner scan = new Scanner(System.in);
    String space = " ";


    public void register() {

        System.out.println("Enter Desired Username");
        username = scan.nextLine();
        if((username.contains(space)) || username.length()<5) {
            System.out.println("Invalid Username");
        }

        System.out.println("Enter Desired Password");
        password = scan.nextLine();
        if ((password.contains(space)) || password.length() < 8) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Welcome to TonBerry Bank, " + username + "!");
        }


    }

    //Login
    public void login()
    {

        System.out.println("Enter Username ");
        loginUser = scan.nextLine();
        System.out.println("Enter Password ");
        loginPass = scan.nextLine();
        //NEED A CREDENTIAL VERIFICATION PROCESS HERE.

        if(username.equals(loginUser) && password.equals(loginPass)){
            System.out.println("Welcome!");

        } else {
            System.out.println("Intruder Alert! Tonberry attack!");

        }
    }
}