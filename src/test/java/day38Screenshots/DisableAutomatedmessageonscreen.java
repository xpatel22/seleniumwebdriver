package day38Screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DisableAutomatedmessageonscreen {
    static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        //to remove "Chrome is being controlled by automated test software"
        options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

    }
}
