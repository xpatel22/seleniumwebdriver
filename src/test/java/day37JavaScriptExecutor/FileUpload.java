package day37JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php/");
        driver.manage().window().maximize();

        //single file upload - C:\AutomationPractice\jsonfiles\students.json
        /*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\AutomationPractice\\jsonfiles\\students.json");

        if (driver.findElement(By.xpath("//li[normalize-space()='students.json']")).getText().equals("students.json"))
        {
            System.out.println("File is successfully uploaded.");
        }
        else
        {
            System.out.println("File upload failed.");
        }*/

        //Multiple files upload
        String file1="C:\\AutomationPractice\\jsonfiles\\students.json";
        String file2="C:\\AutomationPractice\\jsonfiles\\students2.json";
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);

        int numOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

        if (numOfFilesUploaded==2)
        {
            System.out.println("All files are uploaded");
        }
        else
        {
            System.out.println("Files are not uploaded or incorrect files uploaded");
        }

        //validate file names
        String f1=driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText();
        String f2=driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText();
        System.out.println("File 1 : "+f1 +" File 2 : "+f2);

        if (f1.equals("students.json") && f2.equals("students2.json"))
        {
            System.out.println("All files are uploaded");
        }
        else
        {
            System.out.println("Files are not uploaded or incorrect files uploaded");
        }



    }
}
