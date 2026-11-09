package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class BrowserMethods {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //get - opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //getWindowHandle() - returns id of single browser window
        String windowid = driver.getWindowHandle();
        System.out.println("WindowID : " + windowid);

        //getWindowHandles() = returns Ids of multiple browser window
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser window
        Set<String> windowids = driver.getWindowHandles();
        System.out.println(windowids);

        Thread.sleep(5000);
        //driver.close(); //close single browser window where ever the driver is focused
        driver.quit(); //close all the browser windows
    }
}
