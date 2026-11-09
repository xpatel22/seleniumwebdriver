package day42TestNG;

/*
1) Open app
2) Login
3) Logout
 */

import org.testng.annotations.Test;

public class FirstTestCase
{
    @Test(priority = 1)
    void openapp()
    {
        System.out.println("opening app...");
    }

    @Test(priority = 2)
    void login()
    {
        System.out.println("Login to app...");
    }

    @Test(priority = 3)
    void logout()
    {
        System.out.println("Logout from app...");
    }


}
