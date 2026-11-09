package day38Screenshots;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScreenshots {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) full  page screenshot
        /*TakesScreenshot ts = (TakesScreenshot)driver;
        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
        sourcefile.renameTo(targetfile); //copy sourcefile to targetfile
         */

        //2) capture screenshot of specific element
        /*WebElement staticwebtable=driver.findElement(By.xpath("//div[@id='HTML1']"));
        File sourcefile = staticwebtable.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\staticwebtable.png");
        sourcefile.renameTo(targetfile); //copy sourcefile to targetfile
         */

        //3) capture screenshot of webelement
        WebElement logo=driver.findElement(By.xpath("//h2[normalize-space()='Static Web Table']"));
        File sourcefile = logo.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
        sourcefile.renameTo(targetfile); //copy sourcefile to targetfile
    }
}
