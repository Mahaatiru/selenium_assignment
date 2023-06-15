package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ValidCreateUser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        String ChromeDriverPath = "C:\\software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//div[@class='gender']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Aishwarya");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Penmatsa");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("aishwarya.varma@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("gopal123");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("gopal123");
        driver.findElement(By.xpath("//input[@name='register-button']")).click();


        driver.quit();
    }
}
