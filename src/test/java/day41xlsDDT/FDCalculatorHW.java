package day41xlsDDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class FDCalculatorHW {
    static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");

        String filePath=System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";

        int rows=ExcelUtils.getRowCount(filePath,"Sheet1");

        for(int i=1;i<=rows;i++)
        {
            //read data from excel
            String pric = ExcelUtils.getCellData(filePath,"Sheet1",i,0);
            String rateofinterest = ExcelUtils.getCellData(filePath,"Sheet1",i,2);
            String length = ExcelUtils.getCellData(filePath,"Sheet1",i,1);
            String comp = ExcelUtils.getCellData(filePath,"Sheet1",i,3);
            //String fre = ExcelUtils.getCellData(filePath,"Sheet1",i,4);
            String exp_mvalue = ExcelUtils.getCellData(filePath,"Sheet1",i,4);

            //pass above data into application
            driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(pric);
            driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(rateofinterest);
            driver.findElement(By.xpath("////input[@id='mat-input-1']")).sendKeys(length);

            Select comdrp=new Select(driver.findElement(By.xpath("//span[@class='mat-mdc-select-min-line']")));
            comdrp.selectByVisibleText(comp);

            driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")).click(); //clicked on calculate

            //validation
            String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

            if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
            {
                System.out.println("Test passed");
                ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Passed");
                ExcelUtils.fillGreenColor(filePath,"Sheet1",i,7);
            }
            else
            {
                System.out.println("Test failed");
                ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Failed");
                ExcelUtils.fillRedColor(filePath,"Sheet1",i,7);
            }

            Thread.sleep(3000);
            //driver.findElement(By.xpath("//img[@class='PL5']")).click(); //clicked on clear button
        } //ending of for loop
        driver.quit();


    }
}
