package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ClosingSpecificBrowserWindow {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

       Set<String> windowIDs = driver.getWindowHandles();

        for(String winId:windowIDs)
        {
            String title=driver.switchTo().window(winId).getTitle();
            //String url = driver.switchTo().window(winId).getCurrentUrl();

            if(title.equals("OrangeHRM"))
            {
                System.out.println("Closing parent: " +driver.getCurrentUrl());
                driver.close();
                break;
            }
        }

    }
}
