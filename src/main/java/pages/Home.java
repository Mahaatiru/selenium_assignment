package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
    WebDriver driver=null;
    public Home(WebDriver driver)
    {
        this.driver=driver;
    }
    public void setText(String value)
    {
        String loc="//input[@id='FirstName']";
       WebElement e=this. driver.findElement(By.xpath(loc));
       e.sendKeys(value);

    }

    public void setText1(String value)
    {
        String loc="//input[@id='LastName']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);

    }

    public void setText5(String value)
    {
        String loc="//input[@name='Email']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);

    }

    public void setText2(String Value)
    {
        String loc="//input[@name='Email']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(Value);

    }

    public void setText3(String Value)
    {
        String loc="//input[@id='Password']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(Value);

    }

    public void setText4(String Value)
    {
        String loc="//input[@id='ConfirmPassword']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(Value);

    }

    public void clickRegister()
    {
        String loc="//input[@name='register-button']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }

    public void clickLogin()
    {
        String loc="//a[@class='ico-login']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }

    public void clickLogin1()
    {
        String loc="//input[@class='button-1 login-button']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }
    public void clickAccount()
    {
        String loc="//a[@class='account']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }


    public void clickSave()
    {
        String loc="//input[@name='save-info-button']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }
    public void clickClr()
    {
        String loc="//input[@class='button-2 delete-address-button']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }


    public void clickAddress()
    {
        String loc="//a[@href='/customer/addresses']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }
    public void setClear()
    {
        String loc="//input[@id='FirstName']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.clear();

    }
    public void setSearch(String value)
    {
        String loc="//input[@id='small-searchterms']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);

    }

    public void clickSearch()
    {
        String loc="//input[@class='button-1 search-box-button']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }
















}
