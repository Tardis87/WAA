package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SavingsCalcPage {

    @FindBy (id = "fundSelect")
    private WebElement selectFund;

    @FindBy(id = "oneTimeInvestmentInput")
    private WebElement investmentInput;

    @FindBy(id = "yearsInput")
    private WebElement yearInput;

    @FindBy(id = "emailInput")
    private WebElement email;


    private WebDriver pageDriver;

    public SavingsCalcPage(WebDriver driver){
        this.pageDriver=driver;
        PageFactory.initElements(driver, this);
    }

    public void fillDataIn() {
        String investmentOne = "1000";
        String yearsInput = "5";
        String emailInput = "abc12@gmail.com";

        new Select(selectFund).selectByVisibleText("Batman's Cave Development");

        investmentInput.sendKeys(investmentOne);
        yearInput.sendKeys(yearsInput);
        email.sendKeys(emailInput);
    }
}
