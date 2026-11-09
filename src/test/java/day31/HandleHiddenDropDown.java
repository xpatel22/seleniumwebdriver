package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleHiddenDropDown {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");

        driver.manage().window().maximize();

        //Login steps
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //clicking on PIM
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click(); //PIM

        //clicked on dropdown
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
        Thread.sleep(5000);

        //select single option
        //driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();

        //count number of options
        List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));

        System.out.println("Number of options : "+options.size());

        //printing options
        for(WebElement option:options)
        {
            System.out.println(option.getText());
        }





    }
}
