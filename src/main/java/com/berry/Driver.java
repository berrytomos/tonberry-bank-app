package com.berry;

import Interface.HomePage;
import org.apache.logging.log4j;


public class Driver {

    public void runProgram()
    {

        HomePage home = new HomePage();
        home.credentials();
        //DO I NEED IF STATEMENT HERE TO RUN HOMEPAGE AFTER LOGIN CREDENTIALS?
        home.homePage();

    }



    //Main method calling runProgram
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.runProgram();
    }
}
