package day35MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        //switch to frame
        driver.switchTo().frame("iframeResult");

        WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        box1.clear();
        box1.sendKeys("Welcome");

        //Double click action on the button
        Actions act=new Actions(driver);
        //Right click action
        act.doubleClick(button).perform();

        //String text=box2.getText(); //This will not work
        String text=box2.getAttribute("value");

        //validation : box2 should contain "Welcome"
        if (text.equals("Welcome"))
        {
            System.out.println("Text copied...");
        }
        else
        {
            System.out.println("Test not copied properly");
        }



    }

}
