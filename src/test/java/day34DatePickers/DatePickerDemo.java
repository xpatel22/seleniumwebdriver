package day34DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo {
    //select future date
    static void selectFutureDate(WebDriver driver,String fyear, String month, String date)
    {
        while (true)
        {
            String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (currentMonth.equals(month) && currentYear.equals(fyear))
            {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //future year
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous year
        }

        //select the date
        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

        for (WebElement dt:allDates)
        {
            if (dt.getText().equals(date))
            {
                dt.click();
            }
        }

    }

    //select past date
    static void selectPastDate(WebDriver driver,String pyear, String month, String date)
    {
        while (true)
        {
            String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (currentMonth.equals(month) && currentYear.equals(pyear))
            {
                break;
            }
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //future year
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous year
        }

        //select the date
        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

        for (WebElement dt:allDates)
        {
            if (dt.getText().equals(date))
            {
                dt.click();
            }
        }

    }


    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
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
        //selectFutureDate(driver, fyear, month, date);
        selectPastDate(driver, pyear, month, date);

    }
}
