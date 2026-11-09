package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //Click for JS Alert with OK button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);

        //driver.switchTo().alert().accept(); //to accept the alert OK button
        Alert myalert = driver.switchTo().alert();
        //get text from alert window
        System.out.println(myalert.getText());
        myalert.accept();
        Thread.sleep(5000);

        //Click for JS Confirm with OK and Cancel button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);

        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(5000);
        driver.switchTo().alert().accept(); //close alert using OK button
        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss(); //close alert using Cancel button

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Confirmed Clicked for JS Prompt");
        Thread.sleep(5000);
        driver.switchTo().alert().accept(); //close alert using OK button
        //Thread.sleep(5000);



    }
}
