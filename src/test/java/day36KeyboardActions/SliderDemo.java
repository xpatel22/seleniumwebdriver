package day36KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        //Min slider
        WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
        System.out.println("Default Location of min_slider: "+min_slider.getLocation()); //(59,250)

        act.dragAndDropBy(min_slider,100,250).perform();
        System.out.println("Location of min_slider after moving: "+min_slider.getLocation());

        //Max slider
        WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
        System.out.println("Default Location of max_slider: "+max_slider.getLocation()); //(545,250)

        act.dragAndDropBy(max_slider,-45,250).perform();
        System.out.println("Location of max_slider after moving: "+max_slider.getLocation());
    }

}
