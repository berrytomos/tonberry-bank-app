


package Interface;

import java.util.Scanner;

public class HomePage {


    // login or register.
    public void credentials() {
        System.out.println("Welcome to TonBerry Bank, where your money sits in a vault protected by TonBerry's.");

        Scanner scan = new Scanner(System.in);
        String choice = null;


        while (true) {
            //Main menu to Login or Register
            System.out.println("-----------------------------------");
            System.out.println("Register :  Register a New Account");
            System.out.println("Login : to an Existing Account");
            System.out.println("Exit : Exit");
            System.out.println("-----------------------------------");
            choice = scan.next();

            if (choice.equals("Register")) {
                //new registration
                Credentials credentials = new Credentials();
                credentials.register();

            } else if (choice.equals("Login")) {
                //login
                Credentials login = new Credentials();
                login.login();

            } else if (choice.equals ("Exit")) {
                System.exit(0);

            } else {
                System.out.println("Is it really that difficult to choose a valid option?");
                }

            }
        }



    // after login or registration, the homepage appears.
    public void homePage () {

        String choice = null;
        String exit;

        //NEED THIS TO RUN AFTER LOGIN OR REGISTRATION VERIFICATION

        while (true) {

            System.out.println("---------------------------------------------");
            System.out.println("1 Check your Gil Balance");
            System.out.println("2 See your Account and Routing Number");
            System.out.println("3 Deposit Gil");
            System.out.println("4 Withdraw Gil");
            System.out.println("5 Exit");
            System.out.println("---------------------------------------------");

            if (choice.equals("1")) {
                //balance
                Balance balance = new Balance();
                balance.balance();

            } else if (choice.equals("2")) {
                //account and routing number
                Account account = new Account();
                account.accountAndRouting();

            } else if (choice.equals("3")) {
                Deposit deposit = new Deposit();
                deposit.deposit();

            } else if (choice.equals("4")) {
                Withdraw withdraw = new Withdraw();
                withdraw.withdraw();

            } else if (choice.equals("5")) {
                System.out.println("NO! DON'T LEAVE! Tonberry Attack!");
                break;

            } else {
                System.out.println("That's not an option. Don't make me call a TonBerry.");
            }
        }
    }
}

