package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Handleframes {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Frame 1
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); //passed frame as a webelement //switch to frame1

        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");

        //default page
        driver.switchTo().defaultContent(); //go back to page

        //Frame 2
        WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");

        //default page
        driver.switchTo().defaultContent(); //go back to page

        //Frame 3
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");

        //inner iframe - part of frame 3
        driver.switchTo().frame(0); //switching to frame using index

        driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();

        //default page
        driver.switchTo().defaultContent(); //go back to page

        //homework
        //1 - switch to 5th frame
        //2 - click on link - opens new iframe
        //3 - switchto inner frame
        ///4 - check logo presence in the inner frame
    }
}
