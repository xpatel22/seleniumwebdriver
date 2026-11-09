package day21;

/*
Testcase
1) Launch browser (chrome)
2) Open URL : https://demo.opencart.com/
3) Validate title should be "Your store"
4) Close browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main (String[] args)
    {
        //1) Launch browser (chrome)
        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        //WebDriver driver = new FirefoxDriver();

        //2) Open URL : https://demo.opencart.com/
        driver.get("https://demo.opencart.com/");

        //3) Validate title should be "Your store"
        String act_title=driver.getTitle();
        //System.out.println(act_title);
        if (act_title.equals("Your store"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }

        //4) Close browser
        //driver.close();
        driver.quit();


    }
}
