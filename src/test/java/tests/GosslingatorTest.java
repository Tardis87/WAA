package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GosslingatorTest {

    @Test
    public void itShoudAddOneRyan() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //0. spustit prehliadac
        WebDriver driver = new ChromeDriver();
        //1. otvorit stranku
        driver.get("http://localhost/gosslingator.php");
        //2. najst a clicknut na tlacidlo pridat
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("removeRyan")).click();
        //3. overit ci sa zobrazi pocitanie ryanov

        Assert.assertEquals("1", driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

        //vypisem si do console akutalny pocet z pocitadla ryanov
        System.out.println("Number of ryans:" + driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

        Assert.assertEquals("ryan", driver.findElement(By.cssSelector("div.ryan-counter h3")).getText());
        //4.zatvorit prehliadac
        driver.close();
        //5.ukoncit session
        driver.quit();

    }

    @Test
    public void itShoudAddOneRyanTest2() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //0. spustit prehliadac
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/gosslingator.php");

        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();

        Assert.assertEquals("50", driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

        System.out.println(driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

        driver.close();
        //5.ukoncit session
        driver.quit();

    }

    @Test
    public void tooManyRyans() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //0. spustit prehliadac
        WebDriver driver = new ChromeDriver();
        //1. otvorit stranku
        driver.get("http://localhost/gosslingator.php");
        //2. najst a clicknut na tlacidlo pridat

        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();

        Assert.assertEquals("50", driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());
        Assert.assertEquals("NUMBER OF\n" +
                        "RYANS\n" +
                        "IS TOO DAMN\n" +
                        "HIGH" , driver.findElement(By.cssSelector("h1.tooManyRyans")).getText());



        //vypisem si do console akutalny pocet z pocitadla ryanov
        System.out.println("Number of ryans:" + driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

        Assert.assertEquals("ryans", driver.findElement(By.cssSelector("div.ryan-counter h3")).getText());
        //4.zatvorit prehliadac
        driver.close();
        //5.ukoncit session
        driver.quit();

    }
}



