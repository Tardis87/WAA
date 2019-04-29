package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTrainingTestHome {
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //0. spustit prehliadac
       driver = new ChromeDriver();
        //1. otvorit stranku
        driver.get("http://localhost/xpathtrainingcenter.php");
    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    @Test
    public void itShouldFindSecondButton() {
        driver.findElement(By.xpath("//button[contains(text (),'Second')]")).click();
        String messageButton = "you clicked second button";
        Assert.assertEquals(messageButton,driver.findElement(By.xpath("//span[contains(text(),'You clicked Second button')]")).getText());
    }
    @Test
    public void itShouldDisplayEnteredMessage (){
        String message ="vonku prsi";
        driver.findElement(By.cssSelector("input")).sendKeys(message);
        //stlacim tlacitdlo hit me
        driver.findElement(By.id("hitme")).click();
        //precitam hodnotu zo stranky a ulozim ju do premennej
        String actualMessage =  driver.findElement(By.xpath("//span[contains(text(),'You entered')]")).getText();

        Assert.assertEquals("you entered "+message,
                actualMessage
        );
    }
}
