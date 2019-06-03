package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorPage {
    private WebDriver pageDriver;

    public CalculatorPage(WebDriver pageDriver) {
        this.pageDriver=pageDriver;
    }


    public void addInput(String numberInput1, String numberInput2) {
        pageDriver.findElement(By.id("firstInput")).sendKeys(numberInput1);
        pageDriver.findElement(By.id("secondInput")).sendKeys(numberInput2);
    }



    public void clickOndeduct(String deduct) {
        pageDriver.findElement(By.id(deduct)).click();
    }
    public void clickOnReset(String reset) {
        pageDriver.findElement(By.id(reset)).click();}


}
