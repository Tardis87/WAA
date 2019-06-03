package tests;

import base.TestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CalculatorPage;

public class CalculatorTest extends TestBase {
   private CalculatorPage calculatorPage;


    @Before
    public void openPage() {
        driver.get(BASE_URL + "/kalkulacka.php");
        calculatorPage = new CalculatorPage(driver);
    }

    @Test
    public void itShouldCheckSpocitanie(){
        String numberInput1 = "5";
        String numberInput2 = "4";

        calculatorPage.addInput(numberInput1, numberInput2);

        calculatorPage.clickOnReset("count");
        Assert.assertEquals("9",driver.findElement(By.id("result")).getText());
    }



    @Test
    public void itShouldCheckOdpocitanie(){
        String numberInput1 = "5";
        String numberInput2 = "4";

        calculatorPage.addInput(numberInput1, numberInput2);
        calculatorPage.clickOndeduct("deduct");

        Assert.assertEquals("1",driver.findElement(By.id("result")).getText());
    }



    @Test
    public void itShouldReset (){
        String numberInput1 = "5";
        String numberInput2 = "4";

        calculatorPage.addInput(numberInput1, numberInput2);

        calculatorPage.clickOndeduct("deduct");
        calculatorPage.clickOnReset("reset");

        Assert.assertTrue(driver.findElement(By.id("result")).getText().isEmpty());

    }



    @Test
    public void checkIfLastResultsAreNotEmpty(){
        String numberInput1 = "5";
        String numberInput2 = "4";

        calculatorPage.addInput(numberInput1, numberInput2);
        calculatorPage.clickOndeduct("deduct");

        Assert.assertFalse(driver.findElement(By.cssSelector(".latest-results")).getText().isEmpty());
    }





}
