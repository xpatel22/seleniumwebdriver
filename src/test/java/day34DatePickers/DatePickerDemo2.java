package day34DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerDemo2 {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //switch to iframe
        driver.switchTo().frame(0);

        //Method1 : using sendkeys()
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/01/2026");

        //Method2 : using date picker
        //expected data
        String fyear = "2027"; //future year
        String pyear = "2025"; //previous year
        String month = "October";
        String date = "9";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
    }
}
