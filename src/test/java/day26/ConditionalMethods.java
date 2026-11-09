package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;

public class ConditionalMethods {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();
        Thread.sleep(7000);

        //isDisplayed()
        WebElement logo = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
        System.out.println("Display status of logo : " +logo.isDisplayed());
        Thread.sleep(7000);

        //boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();
        //System.out.println("Display status: " +status);

        //boolean status = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isEnabled();
        //System.out.println("Display status: " +status);

        //isEnabled()
        boolean status = driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
        System.out.println("Enabled status: " + status);


        //isSelected()
        WebElement male_rd = driver.findElement(By.xpath("//input[@id='male']"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='female']"));

        System.out.println("Before selection...");
        System.out.println(male_rd.isSelected());  //false
        System.out.println(female_rd.isSelected());  //false

        System.out.println("After selecting male...");
        male_rd.click(); //select male radio button
        System.out.println(male_rd.isSelected());  //true
        System.out.println(female_rd.isSelected());  //false

    }
}
