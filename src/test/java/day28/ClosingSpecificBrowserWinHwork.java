package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class ClosingSpecificBrowserWinHwork {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();


        //count number of links
        //List<WebElement> links = driver.findElements(By.id("wikipedia-search-result-link"));
        List<WebElement> links = driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']"));
        //List<WebElement> links = driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more']"));

        System.out.println("Total number of links:" +links.size());

        //click on eachlink using for loop
        for(WebElement link:links)
        {
            link.click();
        }

        //get window ID's for every browser window
        Set<String> windowIDs = driver.getWindowHandles();

        for(String winId:windowIDs)
        {
            String title=driver.switchTo().window(winId).getTitle();
            System.out.println("Title : " +title +",WindowID : " +winId);


            if(title.equals("Selenium in biology - Wikipedia"))
            {
                //System.out.println(driver.getCurrentUrl());
                System.out.println("Closing URL : " +driver.getCurrentUrl());
                driver.close();
                //some validation on the parent window
            }
        }
        //close specific browser window

        //for(String link:links)

//       Set<String> windowIDs = driver.getWindowHandles();
//
//        for(String winId:windowIDs)
//        {
//            String title=driver.switchTo().window(winId).getTitle();
//            //String url = driver.switchTo().window(winId).getCurrentUrl();
//
//            if(title.equals("OrangeHRM"))
//            {
//                System.out.println("Closing parent: " +driver.getCurrentUrl());
//                driver.close();
//                break;
//            }
//        }

    }
}
