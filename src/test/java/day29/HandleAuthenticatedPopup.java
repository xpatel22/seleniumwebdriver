package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
