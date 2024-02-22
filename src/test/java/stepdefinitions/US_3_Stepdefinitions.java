package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.assertTrue;

public class US_3_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();
    Actions actions=new Actions(Driver.getDriver());

    SoftAssert softAssert=new SoftAssert();

    @Given("User should be able to click on OPERATION MODULE")
    public void user_should_be_able_to_click_on_operatıon_module() {

    pageHYBS.isletmeModuluLink.click();
        actions.moveToElement(pageHYBS.FirmaListesi).perform();
        assertTrue(pageHYBS.FirmaListesi.isDisplayed());
        actions.moveToElement(pageHYBS.AracListesi).perform();
        assertTrue(pageHYBS.AracListesi.isDisplayed());


    }
    @Given("The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed.\"")
    public void the_user_clicks_on_the_company_lıst_link_and_goes_to_the_relevant_page_and_it_is_tested_that_the_information_about_the_companies_is_listed() {

    pageHYBS.FirmaListesi.click();

    softAssert.assertTrue(pageHYBS.firmaUnvanibasligi.isDisplayed());
    softAssert.assertTrue(pageHYBS.islemvemobiluygulamatelefonbasligi.isDisplayed());
    softAssert.assertTrue(pageHYBS.ilcebasligi.isDisplayed());
    softAssert.assertTrue(pageHYBS.adresbasligi.isDisplayed());
    softAssert.assertTrue(pageHYBS.epostabasligi.isDisplayed());
    softAssert.assertTrue(pageHYBS.sicilnobasligi.isDisplayed());
    softAssert.assertAll();

pageHYBS.firmalistesitablosu.isDisplayed();

    }


    @Given("click group dropdown")
    public void click_group_dropdown() {


        ReusableMethods.wait(3);
        pageHYBS.firmalistesilütfengrupsecinizdropdown.click();


    }
    @Given("Verifies that category dropbox options are visible and selectable")
    public void verifies_that_category_dropbox_options_are_visible_and_selectable()  throws InterruptedException {


        ReusableMethods.waitForPageToLoad(3);
      //  ReusableMethods.verifyAllItemsAreClickable(pageHYBS.);


    }

}
