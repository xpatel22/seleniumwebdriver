package day36KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenLinkInNewTab {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        //Directly click on Register link on same Tab
        //regLink.click();

        Actions act = new Actions(driver);

        //Ctrl +click +"Register link" - opens Register link on another Tab
        act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();

        //switching to registration page
        //Set<String> ids = driver.getWindowHandles();
        //List<String> lids= new ArrayList(ids);
        List<String> ids=new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(ids.get(1)); //switch to registration page
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John Kennedy");

        //Switch back to Home page
        driver.switchTo().window(ids.get(0));
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");



    }
}
