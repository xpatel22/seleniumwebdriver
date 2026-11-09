package day36KeyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TabsAndWindows {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        //Selenium 4.x
        //driver.switchTo().newWindow(WindowType.TAB); //opens new tab
        driver.switchTo().newWindow(WindowType.WINDOW); //opens new window
        driver.get("https://orangehrm.com");
    }
}
