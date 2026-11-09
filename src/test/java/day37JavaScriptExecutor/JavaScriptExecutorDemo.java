package day37JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");

        //passing the text into inputbox - alternate of sendKeys
        //only use this when you get ElementInterceptedException
        WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','John')",inputbox);

        //driver.findElement(By.xpath("//input[@id='male']")).click();

        //click action using JSExecutor - alternate of click()
        WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()",radiobtn);



    }
}
