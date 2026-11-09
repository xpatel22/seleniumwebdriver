package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFirstTC {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        String act_title = driver.getTitle();
        if (act_title.equals("Google"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
        driver.quit();

    }
}
