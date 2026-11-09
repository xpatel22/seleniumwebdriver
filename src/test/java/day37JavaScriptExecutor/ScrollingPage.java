package day37JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        /*
        //1) scroll down page by pixel number
        js.executeScript("window.scrollBy(0,1500)","");
        System.out.println(js.executeScript("return window.pageYOffset;"));
         */

        /*
        //2) scroll down page till element is visible
        WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']"));

        js.executeScript("arguments[0].scrollIntoView();",ele);
        System.out.println(js.executeScript("return window.pageYOffset;"));
         */

        //3) scroll down page till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        //4) scroll back up to top of the page
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        js.executeScript("document.body.style.zoom='50%'"); //set zoom level 50%
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='100%'"); //set zoom level 100%
        Thread.sleep(5000);
    }
}
