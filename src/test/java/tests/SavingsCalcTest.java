package tests;

import base.TestBase;
import io.codearte.jfairy.Fairy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.SavingsCalcPage;

public class SavingsCalcTest extends TestBase {
    private SavingsCalcPage savingsCalcPage;

    @Before
    public void openPage() {
        driver.get(BASE_URL + "/savingscalculator.php");
        savingsCalcPage = new SavingsCalcPage(driver);
            }


    @Test
    public void applyButtonshouldBeEnabled() {

        savingsCalcPage.fillDataIn();
        Assert.assertTrue(driver.findElement(By.cssSelector(".btn-success")).isEnabled());
    }



    @Test
    public void checkIfSumsArenotEmpty (){

        savingsCalcPage.fillDataIn();
        Assert.assertFalse(driver.findElement(By.xpath("//./div[1]/p")).getText().isEmpty());
        Assert.assertFalse(driver.findElement(By.xpath("//./div[2]/p")).getText().isEmpty());

    }

    @Test
    public void checkIfRisksAreNotEmpty(){

        savingsCalcPage.fillDataIn();
        Assert.assertFalse(driver.findElement(By.xpath("//./div[3]/p")).getText().isEmpty());

    }

    @Test
    public  void checkIfRequestContainsFond(){

        savingsCalcPage.fillDataIn();
        driver.findElement(By.xpath("//button")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//p[@class ='fund-description']")).getText().isEmpty());
    }


}


