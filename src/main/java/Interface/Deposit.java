package Interface;

import java.util.Scanner;

public class Deposit
{
    double amount;
    Scanner scan = new Scanner(System.in);

    public void deposit()
    {
        System.out.println("How much would you like to deposit today?");
        System.out.print("$ ");
        amount = scan.nextDouble();

        System.out.println( "$" + amount + " will be deposited in your account.");

    }

}