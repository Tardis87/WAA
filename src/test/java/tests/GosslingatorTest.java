package tests;

import base.TestBase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class GosslingatorTest extends TestBase {

   private String actualNumberOfRyans;

    @Before
    public void openPage (){


        driver.get(BASE_URL + "/gosslingator.php");
    }




    @Test
    public void itShoudAddOneRyan() {

        //2. najst a clicknut na tlacidlo pridat
        WebElement addRyanButton = driver.findElement(By.id("addRyan"));
        addRyan();
        addRyan();
        addRyan();
        //3. overit ci sa zobrazi pocitanie ryanov
        String actualNumberOfRyans =  getRyanCounterNumber();
        assertEquals("3", getRyanCounterNumber());

        //vypisem si do console akutalny pocet z pocitadla ryanov
        System.out.println("Number of ryans:" + driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

        assertEquals("ryans", getCounterDescription());
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

        assertEquals("50", driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());

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
            assertEquals(String.valueOf(i + 1), actualNumberOfRyans);


            //overit sklonovanie pomocou podmienky
            String actualDescription = driver.findElement(By.cssSelector("div.ryan-counter h3")).getText();
            if (i+1==1) {
                assertEquals("ryan", actualDescription);
            }
            if (i + 1 >=2){
                assertEquals("ryans",actualDescription);
            }
            //overim si pocet obrazkov ryana
            int numberOfRyanImages = driver.findElements(By.cssSelector("img")).size();
            Assert.assertEquals(i+1,numberOfRyanImages);

            System.out.println("index i = " + i);
            System.out.println("pocet ryanov = " +actualNumberOfRyans);



        }




        assertEquals("NUMBER OF\n" +
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

    @Test
    public void itShouldDisplanyNoRyans(){
        Assert.assertEquals(
                0,
                driver.findElements(By.cssSelector("img")).size());


    }

    private void addRyan(){
        WebElement ryanButton = driver.findElement(By.id("addRyan"));
       ryanButton.click();

    }

            private String getRyanCounterNumber(){
            return driver.findElement(By.id("ryanCounter")).getText();
            }

            private String getCounterDescription(){
            return driver.findElement(By.cssSelector("div.ryan-counter h3")).getText();
            }

            private String getNumberOfRyanImages(){
            return driver.findElement(By.cssSelector("div.ryan-counter h2")).getText();
            }



}



