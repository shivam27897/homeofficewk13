package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {

    public StartPage() {
        PageFactory.initElements(driver, this);
}

    @FindBy(xpath = "//div[@id='global-cookie-message']/div[1]/div/div[2]/button[1]")
    WebElement accept;
    //@FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]") WebElement accept;
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;

    public void acceptAllCookies() {
        clickOnElement(accept);
    }

    public void clickStartNow(){ clickOnElement(startNowButton);
    }
}
