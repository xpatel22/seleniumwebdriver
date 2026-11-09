package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        //XPath with single attribute
        //driver.findElement(By.xpath("//textarea[@id='ti6dpd']")).sendKeys("TShirts");

        //XPath with multiple attributes
        //driver.findElement(By.xpath("//textarea[@id='ti6dpd'][@name='q']")).sendKeys("Polo");

        //XPath with 'and' 'or' attributes
        //driver.findElement(By.xpath("//textarea[@id='ti6dpd' and @name='q']")).sendKeys("Polo");
        driver.findElement(By.xpath("//textarea[@id='ti6dpd' or @name='q']")).sendKeys("Polo");
    }
}
