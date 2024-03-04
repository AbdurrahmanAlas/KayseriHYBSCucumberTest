package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_4_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();
    Actions actions=new Actions(Driver.getDriver());

    @Given("click on the inspect eye icon")
    public void click_on_the_inspect_eye_icon() {
        pageHYBS.incelegözsimgesi.click();
    }

    @Given("Company Name and Registration number must appear.")
    public void company_name_and_registration_number_must_appear() {


   Assert.assertTrue(pageHYBS.firmaAdıveSicilNoGeldimi.isDisplayed());


    }

    @Given("The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST buttons should be visible")
    public void the_company_s_balance_ats_document_extend_blacklıst_buttons_should_be_visible() {
        Assert.assertTrue(pageHYBS.ATSOnayBelgesiButton.isDisplayed());
        Assert.assertTrue(pageHYBS.karaListeyeAlbutton.isDisplayed());

    }
    @Given("The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST and their functions should work properly when clicked.")
    public void the_company_s_balance_ats_document_extend_blacklıst_and_their_functions_should_work_properly_when_clicked() {

     pageHYBS.ATSOnayBelgesiButton.click();

     Assert.assertTrue(pageHYBS.ATSBelgesiUzatText.isDisplayed());
        ReusableMethods.wait(3);
     pageHYBS.ATSBelgesiUzatTextinUzerindekiCarpı.click();
        ReusableMethods.wait(3);
     pageHYBS.karaListeyeAlbutton.click();
        ReusableMethods.wait(3);
     Assert.assertTrue(pageHYBS.karalisteText.isDisplayed());
     pageHYBS.KaralisteTextIptalbutonu.click();




    }

}
