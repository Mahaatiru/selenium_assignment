package testcases;
import io.restassured.RestAssured;
import org.asynchttpclient.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestRestAssured {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=null;
        String chromeDriverPath = "C:\\software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", chromeDriverPath);
        driver.get("https://demowebshop.tricentis.com/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("fiction");
        driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
        Response response= (Response) RestAssured.get("https://demowebshop.tricentis.com/search?q=fiction");
        int statusCode=response.getStatusCode();
        String responseBody;
        responseBody = response.getUri().toString();
        driver.quit();



    }

}
