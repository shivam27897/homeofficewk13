package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VisaConfirmationTest extends TestBase {
    StartPage startPage;
    SelectNationalityPage snp;
    ReasonForTravelPage rftp;
    ResultPage rp;
    DurationOfStayPage dosp;
    WorkTypePage wtp;
    @BeforeMethod
    public void inIT() {
        startPage=new StartPage();
        snp = new SelectNationalityPage();
        rftp = new ReasonForTravelPage();
        rp = new ResultPage();
        dosp = new DurationOfStayPage();
        wtp = new WorkTypePage();
    }
    @Test
    public void anAustralianCominToUKForTourism() {
        startPage.acceptAllCookies();
        driver.switchTo().defaultContent();
        startPage.clickStartNow();
        snp.selectingCountry("Australia");
        snp.clickOnContinueButton();
        rftp.selectReason();
        rftp.clickOnnextBtn();
        String actualmsg = rp.verifyMsg();
        String expectedmsg = "You will not need a visa to come to the UK";
        Assert.assertEquals(actualmsg,expectedmsg);
    }
    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        startPage.acceptAllCookies();
        driver.switchTo().defaultContent();
        startPage.clickStartNow();
        snp.selectingCountry("Chile");
        snp.clickOnContinueButton();
        rftp.selectReason1();
        rftp.clickOnnextBtn();
        dosp.clickOnMorethanSixMonth();
        rftp.clickOnnextBtn();
        wtp.selectHealthcare();
        rftp.clickOnnextBtn();
        String actualmsg1 = rp.verifyMsg();
        String expectedmsg1= "You need a visa to work in health and care";
        Assert.assertEquals(actualmsg1,expectedmsg1);
    }
    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.acceptAllCookies();
        driver.switchTo().defaultContent();
        startPage.clickStartNow();
        snp.selectingCountry("Colombia");
        snp.clickOnContinueButton();
        rftp.selectReason2();
        rftp.clickOnnextBtn();
        String actualmsg2 = rp.verifyMsg();
        String expectedmsg2= "You may need a visa";
        Assert.assertEquals(actualmsg2,expectedmsg2);
    }
}
