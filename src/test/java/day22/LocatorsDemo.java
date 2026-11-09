package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://demo.opencart.com/");
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        //name
        //driver.findElement(By.name("search")).sendKeys("Mac");
        driver.findElement(By.name("q")).sendKeys("Mac");


        //id
        //boolean logoDisplaystatus = driver.findElement(By.id("logo")).isDisplayed();
        //System.out.println(logoDisplaystatus);
        boolean logoDisplaystatus = driver.findElement(By.id("ti6dpd")).isDisplayed();
        System.out.println(logoDisplaystatus);

        //linktext & partialLinkText
        //driver.findElement(By.linkText("About")).click();
        //driver.findElement(By.partialLinkText("Abou")).click();

        //classname
        List<WebElement> headerLinks = driver.findElements(By.className("w5hRs"));
        System.out.println("Total number of header links:" +headerLinks.size());

        //tagname
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links:" +links.size());

        //tagname
        //List<WebElement> images = driver.findElements(By.tagName("img"));
        //System.out.println("Total number of images:" +images.size());
    }
}
