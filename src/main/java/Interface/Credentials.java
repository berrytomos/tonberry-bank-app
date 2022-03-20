package Interface;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;




public class Credentials {
    private String accountNumber;
    private static String user;
    private static String pass;
    private String loginUser;
    private String loginPass;

    Scanner scan = new Scanner(System.in);
    String space = " ";


    // Register for a new account
    public void register() {


        Map<String, String> credentials = new HashMap<String, String>();

        System.out.println("Enter Desired Username");
        user = scan.nextLine();
        if((user.contains(space))) {
            System.out.println("Invalid Username");
        }

        System.out.println("Enter Desired Password");
        pass = scan.nextLine();
        if ((user.contains(space))) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Welcome to TonBerry Bank, " + user + "!");
        }

        credentials.put(user,pass); // HashMap stores username and password


    }

    //Login
    public void login()
    {

        System.out.println("Enter Username ");
        loginUser = scan.nextLine();
        System.out.println("Enter Password ");
        loginPass = scan.nextLine();

        if(user.equals(loginUser) && pass.equals(loginPass)){
            System.out.println("Welcome Back!");


        } else {
            System.out.println("Intruder Alert! Tonberry attack!");
        }
    }
}
