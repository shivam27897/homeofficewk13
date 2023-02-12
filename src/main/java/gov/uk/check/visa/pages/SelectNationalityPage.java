package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="response")
    WebElement country;
    @FindBy(xpath="//button[text()='Continue']")
    WebElement continueButton;

    public void selectingCountry(String countryName){
        selectByVisibleTextFromDropDown(country,countryName);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
