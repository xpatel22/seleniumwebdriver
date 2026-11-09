package day38Screenshots;

/*
Testcase
1) Launch browser (chrome)
2) Open URL : https://demo.opencart.com/
3) Validate title should be "Your store"
4) Close browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

    public static void main (String[] args)
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); //setting for headless mode of execution

        WebDriver driver = new ChromeDriver(options);


        driver.get("https://www.google.com/");
        String act_title = driver.getTitle();
        if (act_title.equals("Google"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
        driver.quit();

    }
}
