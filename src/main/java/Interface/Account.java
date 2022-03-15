package Interface;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Account
{
    private int accountNumber; // Will be assigne to each individual user.
    private int routingNumber = 50008375;


    //Direct com.berry.user.UserInterface.Deposit. UserInterface.Account and Routing Number.
    //This should be initialized once a username and password is created.
    public void accountAndRouting()
    {
        System.out.println("Account Number" + "\n" + accountNumber);
        System.out.println("Routing Number" + "\n" + routingNumber);

    }
}