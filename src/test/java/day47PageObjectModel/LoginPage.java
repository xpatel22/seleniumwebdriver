package day47PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This is Page Object Class
//constructor
//locators
//Action methods

public class LoginPage {

    WebDriver driver;

    //constructor
    LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //Locators
    //driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    By txt_username_loc=By.xpath("//input[@placeholder='Username']");

    //driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("a;dmin123");
    By txt_password_loc=By.xpath("//input[@placeholder='Password']");

    //driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    By btn_login_loc=By.xpath("//button[normalize-space()='Login']");


    //Action methods

    public void setUserName(String user)
    {
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    public void setPassword(String pwd)
    {
        driver.findElement(txt_password_loc).sendKeys(pwd);
    }

    public void clickLogin()
    {
        driver.findElement(btn_login_loc).click();
    }

}
