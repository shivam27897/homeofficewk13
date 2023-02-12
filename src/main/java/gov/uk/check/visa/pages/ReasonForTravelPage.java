package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "response-0")
    WebElement reasonForVisitList;
    @FindBy(id = "response-1")
    WebElement reasonForVisitList1;
    @FindBy(id = "response-4")
    WebElement reasonForVisitList2;

    @FindBy(xpath="//button[text()='Continue']")
    WebElement continueButton;

    public void selectReason(){
        clickOnElement(reasonForVisitList);
    }
    public void selectReason1(){
        clickOnElement(reasonForVisitList1);
    }
    public void selectReason2(){
        clickOnElement(reasonForVisitList2);
    }
    public void clickOnnextBtn(){
        clickOnElement(continueButton);
    }
}
