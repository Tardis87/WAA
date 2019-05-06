package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GosslingatorTest {
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver74.exe");
        //0. spustit prehliadac
        driver = new ChromeDriver();
        //1. otvorit stranku
        driver.get("http://localhost:8888/gosslingator.php");
    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }



    @Test
    public void itShoudAddOneRyan() {

        //2. najst a clicknut na tlacidlo pridat
        WebElement addRyanButton = driver.findElement(By.id("addRyan"));
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        //3. overit ci sa zobrazi pocitanie ryanov
        String actualNumberOfRyans =  driver.findElement(By.cssSelector("div.ryan-counter h2")).getText();
        Assert.assertEquals("3", actualNumberOfRyans);

        //vypisem si do console akutalny pocet z pocitadla ryanov
        System.out.println("Number of ryans:" + driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

        Assert.assertEquals("ryans", driver.findElement(By.cssSelector("div.ryan-counter h3")).getText());
        //4.zatvorit prehliadac


    }

    @Test
    public void itShoudAddOneRyanTest2() {
     //alt+J oznacenie kzdeho dalsieho vyskytu
        WebElement addRyanButton = driver.findElement(By.id("addRyan"));
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();
        addRyanButton.click();

        Assert.assertEquals("50", driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

        System.out.println(driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());


    }






    @Test
    public void tooManyRyans() {

        //2. najst a clicknut na tlacidlo pridat
        WebElement addRyanButton = driver.findElement(By.id("addRyan"));
        for (int i = 0; i <50 ; i++) {
            addRyanButton.click();
            String actualNumberOfRyans = driver.findElement(By.id("ryanCounter")).getText();
            //porovnam skutocnu hodnotu zo stranky s hodnotou indexu +1
            //index si musim  premenit na string aby so imohol porovnat
            Assert.assertEquals(String.valueOf(i + 1), actualNumberOfRyans);


            //overit sklonovanie pomocou podmienky
            String actualDescription = driver.findElement(By.cssSelector("div.ryan-counter h3")).getText();
            if (i+1==1) {
                Assert.assertEquals("ryan", actualDescription);
            }
            if (i + 1 >=2){
                Assert.assertEquals("ryans",actualDescription);
            }

            System.out.println("index i = " + i);
            System.out.println("pocet ryanov = " +actualNumberOfRyans);
        }




        Assert.assertEquals("NUMBER OF\n" +
                        "RYANS\n" +
                        "IS TOO DAMN\n" +
                        "HIGH" , driver.findElement(By.cssSelector("h1.tooManyRyans")).getText());



        //vypisem si do console akutalny pocet z pocitadla ryanov
       // System.out.println("Number of ryans:" + driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

        //Assert.assertEquals("ryans", driver.findElement(By.cssSelector("div.ryan-counter h3")).getText());
        //4.zatvorit prehliadac



    }

    @Test
    public void itShouldDisplayWarningWhileCycle () {
        WebElement addRyanButton = driver.findElement(By.id("addRyan"));
        String actualNumberOfRyans =  driver.findElement(By.cssSelector("div.ryan-counter h2")).getText();
        //while cycklus sa vykona vzdy ak je podmienka true
        int clickslimit = 30;
        int clicks = 0;


        while (!actualNumberOfRyans.equals("50")&& clicks <= clickslimit ) {
            addRyanButton.click();
            actualNumberOfRyans = driver.findElement(By.id("ryanCounter")).getText();
            clicks++;
        }



    }


}



