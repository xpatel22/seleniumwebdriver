package day35MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.get("http://demo.guru99.com/test/drag_drop.html");
        //Bank->Account, Amount -> 5000,
        //Account -> Sales, Amount->5000
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        WebElement source=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
        WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
        act.dragAndDrop(source,destination).perform();

    }

}
