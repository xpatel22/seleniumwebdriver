package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

       Set<String> windowIDs = driver.getWindowHandles();

       //Approach1
        List<String> windowList = new ArrayList<>(windowIDs);

        String parentId = windowList.get(0);
        String childId = windowList.get(1);

        //Before switching - parent URL
        System.out.println(driver.getTitle());

        //switch to child window
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());


        //switch to parent window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());

        //Approach2
        for(String winId:windowIDs)
        {
            String title=driver.switchTo().window(winId).getTitle();

            if(title.equals("OrangeHRM"))
            {
                System.out.println(driver.getCurrentUrl());
                //some validation on the parent window
            }
        }

    }
}
