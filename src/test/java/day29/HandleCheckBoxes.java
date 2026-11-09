package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckBoxes {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) select specific checkbox
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2) select all the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        /*
        for(WebElement checkbox:checkboxes)
        {
            checkbox.click();
        }
         */

        //3) select last 3 checkboxes
        for (int i=4; i<checkboxes.size();i++)
        {
            checkboxes.get(i).click();
        }

        Thread.sleep(5000);

        //4) unselect checkboxes if they are selected
        for (int i=0; i<checkboxes.size();i++)
        {
            if (checkboxes.get(i).isSelected())
            {
                checkboxes.get(i).click();
            }
        }


    }
}
