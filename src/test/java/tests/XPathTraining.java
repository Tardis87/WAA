package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTraining {
    @Test
    public void itStrtudAddOneRyan() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //0. spustit prehliadac
        WebDriver driver = new ChromeDriver();
        //1. otvorit stranku
        driver.get("http://localhost/xpathtrainingcenter.php");

        //2.hladat buttony podla triedy, textu
        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());



        driver.close();
        //5.ukoncit session
        driver.quit();

    }
}
