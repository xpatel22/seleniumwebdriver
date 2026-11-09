package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();

        //1)find total number of rows in a table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows: "+rows);

        //2)COunt total number of columns in a table
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of column : "+columns);

        //3)Read data from specific row and column
        String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
        System.out.println("Book Name : "+bookName);

        //4) read data from all rows and cols
        for (int r=2;r<=rows;r++)
        {
            for (int c=1;c<=columns;c++)
            {
                String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
                System.out.print(value+"\t");
            }
            System.out.println();
        }

        //5) Print book names whose author is Mukesh
        for (int r=2;r<=rows;r++)
        {
            String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            //System.out.println(authorName);

            if (authorName.equals("Mukesh"))
            {
                String bkName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(bkName+"\t"+authorName);
            }
        }

        //6) Find total price for all the books
        int total=0;
        for (int r=2;r<=rows;r++)
        {
            String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            System.out.println(price);
            total = total + Integer.parseInt(price);
        }
        System.out.println("Total price: "+total);

    }
}
