package tests;

import base.TestBase;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FellowshipTest extends TestBase {

    @Before
    public void openPage() {

        driver.get(BASE_URL + "/fellowship.php");
    }




    @Test
    public void itShouldContainNameForEachFellow() {

        List<WebElement> fellowElements = driver.findElements(By.cssSelector("ul.list-of-fellows li"));
        //preiterujeme fellow elementy a pre kazdeho jedneho vypisem jeho meno
        for (WebElement fellowElement : fellowElements) {
            System.out.println(fellowElement.findElement(By.cssSelector("h1")).getText());
            //ceknem ze to ma meno vsade
            fellowElement.findElements(By.cssSelector("h1"));
            WebElement fellowName = fellowElement.findElement(By.cssSelector("h1"));
            Assert.assertFalse(fellowName.getText().isEmpty());


        }

    }

    @Test
    public void itShouldContainSpecifiedFellows() {
        //chcem si vytiahnut mena a ulozit do ineho zoznamu
        List<WebElement> fellowElements = driver.findElements(By.cssSelector("ul.list-of-fellows li"));
        //vytvorim list so stringami, new array je novy list ktory este nemam zadefinovany
        List<String> fellowNames = new ArrayList<String>();
        //napchat z jedhoho do druhehu listu iba mena

        //vybrala som webelementy lebo chcem vytiahnut z web elementov do arrays
        for (WebElement fellowElement : fellowElements) {
            System.out.println(fellowElement.findElement(By.cssSelector("h1")).getText());
            //v ramci kazdej kachlicky si najdem meno a to ulozim do zoznamu mien
            fellowNames.add(fellowElement.findElement(By.cssSelector("h1")).getText());
            // overim ze list obsahuje Gandalf, Aragorn

        }
        Assert.assertTrue(fellowNames.contains("Gandalf"));
    }

    @Test
    public void itShouldDisplayCompleteAfterclicking() {
       //String[]selectedFellowship = {"Gandalf","Legolas","Gimli","Boromir"}

        driver.findElement(By.xpath("//h1[contains(text(), 'Gandalf')]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), 'Legolas')]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), 'Gimli')]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), 'Boromir')]")).click();

        Assert.assertEquals("Complete", driver.findElement(By.cssSelector("h3")).getText());


        }

        @Test
    public void itShouldbe25OnTheBeginning () {
        Assert.assertEquals("25", driver.findElement(By.xpath("//h2[contains(text(),'25')]")).getText());
        }

        @Test
    public void eachFellowShouldHavePoints () {
            //zoznam so vsetkymi kachlami
            List<WebElement> fellowElements = driver.findElements(By.cssSelector("ul.list-of-fellows li"));

            for (WebElement fellowElement : fellowElements) {

                Assert.assertFalse(fellowElement.findElement(By.cssSelector("div.fellow-points h2")).getText().isEmpty());



            }
         //Assert.assertFalse(driver.findElements(By.cssSelector("div.fellow-points h2")).isEmpty());

        }
    @Test
    public void itShouldDisplayMessageComplete() {
        List<String> fellowsToSelect = new ArrayList<String>();
        fellowsToSelect.add("Gandalf");
        fellowsToSelect.add("Aragorn");
        fellowsToSelect.add("Legolas");
        fellowsToSelect.add("Frodo");

        for (String fellowToSelect : fellowsToSelect) {
            driver.findElement(By.xpath("//h1[contains(text(),'" + fellowToSelect + "')]")).click();
        }

        Assert.assertEquals("Complete", driver.findElement(By.cssSelector("div.points-left h3")).getText());
    }


    }



