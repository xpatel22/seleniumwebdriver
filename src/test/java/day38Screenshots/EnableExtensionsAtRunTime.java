package day38Screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class EnableExtensionsAtRunTime {
    static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        //File file = new File("C:\\Users\\xpate\\IdeaProjects\\crx files\\SelectorsHub-Chrome-Web-Store.crx");
        File file = new File("C:\\Users\\xpate\\IdeaProjects\\crx files\\Ad-Blocker-Stands-AdBlocker-Chrome-Web-Store.crx");
        options.addExtensions(file);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

    }
}
