package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https:/money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        //Self - Selects the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'L&T Finance')]/self::a")).getText();
        System.out.println("Self :" +text);

        //Parent - Selects the parent of the current node (always One)
        text = driver.findElement(By.xpath("//a[contains(text(),'L&T Finance')]/parent::td")).getText();//
        System.out.println("Parent :" +text);

        //Child - Selects all the children of the current node (One or many)
        //List <WebElement> childs = driver.findElement(By.xpath("//a[contains(text(),'L&T Finance')]/ancester::tr/")).getText();//
        //System.out.println("Parent :" +text);




    }
}
