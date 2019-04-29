package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //0. spustit prehliadac
        driver = new ChromeDriver();
        //1. otvorit stranku
        driver.get("http://localhost/registracia.php");
    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    @Test
    public void itShouldRegisterValidUser(){
       String email = "123@gmail.com";
       String meno = "andrea";
       String priezvisko = "strouhalova";
       String heslo = "123456";

       driver.findElement(By.name("email")).sendKeys(email);
       driver.findElement(By.name("name")).sendKeys(meno);
        driver.findElement(By.name("surname")).sendKeys(priezvisko);
        driver.findElement(By.name("password")).sendKeys(heslo);
        driver.findElement(By.name("password-repeat")).sendKeys(heslo);

        //klik na som robot
        driver.findElement(By.id("checkbox")).click();
        //klik na registraciu
        driver.findElement(By.xpath("//button")).click();
        //overit uspesnu hlasku moze byt takto alebo aj
        //Assert.assertEquals("Registracia uspesna!", driver.findElement(By.xpath("//strong")).getText());
        Assert.assertTrue(driver.findElement(By.cssSelector("div.alert-success")).isDisplayed());
    }
        @Test
    public void itShouldDisplayErrorMessageWhenInputAreEmpty (){
            driver.findElement(By.id("checkbox")).click();
            driver.findElement(By.xpath("//button")).click();
            Assert.assertTrue(driver.findElement(By.cssSelector("div.alert-danger")).isDisplayed());

        }
}

