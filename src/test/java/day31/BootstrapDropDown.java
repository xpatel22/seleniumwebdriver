package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootstrapDropDown {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        //opens dropdown options
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

        //1) Select single option
        driver.findElement(By.xpath("//input[@vaule='Java']")).click();

        //2) capture all the options and find out size
        List <WebElement> options = driver.findElements(By.xpath("//ui[contains(@class,'multiselect')]//label"));
        System.out.println("Number of options: "+options.size());

        /*3) //printing options from dropdown
        for (WebElement option:options)
        {
            System.out.println(option.getText());
        }
        */

        //4) select multiple options
        for (WebElement option:options)
        {
            if(option.getText().equals("Java") || option.getText().equals("Python") || option.getText().equals("MySQL"))
            {
                option.click();
            }
        }




    }
}
