package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {


    @FindBy(xpath = "//label[text()='longer than 6 months']")
    WebElement moreThanSixMonths;


    public void clickOnMorethanSixMonth(){
        clickOnElement(moreThanSixMonths);
    }
}
