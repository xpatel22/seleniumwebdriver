package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();

        //driver.get("https://demo.nopcommerce.com/"); //accepts url only in string format

        //driver.navigate().to("https://demo.nopcommerce.com/");

        //URL myurl = new URL("https://demo.nopcommerce.com/"); //accepts URL in string format
        //driver.navigate().to(myurl); //accepts URL in object format

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

    }
}
