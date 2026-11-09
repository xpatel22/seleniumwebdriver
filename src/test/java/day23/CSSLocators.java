package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        //cssSelector - tag#id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

        //cssSelector - tag.classname
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");

        //cssSelector tag attribute - tag[attribute='value']
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");

        //cssSelector tag class attribute - tag.classname[attribute='value']
        //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirts");

    }
}
