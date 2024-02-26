package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.assertTrue;

public class US_3_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();
    Actions actions=new Actions(Driver.getDriver());
    String subjectText;
    String expectedKelime;
    String actualKelime;
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



    }


    @Given("click group dropdown")
    public void click_group_dropdown() {


        ReusableMethods.wait(3);
        pageHYBS.firmalistesilütfengrupsecinizdropdown.click();


    }
    @Given("Verifies that category dropbox options are visible and selectable")
    public void verifies_that_category_dropbox_options_are_visible_and_selectable()  throws InterruptedException {


        ReusableMethods.waitForPageToLoad(3);
      // ReusableMethods.verifyAllItemsAreClickable(pageHYBS.firmalistesilütfengrupsecinizdropdown,pageHYBS.companygroupCurrentsearchtext);


    }


    @Given("click user passive radiobutton and verify user passive list")
    public void click_user_passive_radiobutton_and_verify_user_passive_list() {

        pageHYBS.userpassivelist.click();

        Assert.assertTrue(pageHYBS.userpassivelistEVET.isDisplayed());
        ReusableMethods.wait(2);
        pageHYBS.userpassivelist.click();

    }
    @Given("click cleaning company radiobutton and verify cleaning company list")
    public void click_cleaning_company_radiobutton_and_verify_cleaning_company_list() {

            pageHYBS.blacklist.click();
            Assert.assertTrue(pageHYBS.blacklistEVET.isDisplayed());
        ReusableMethods.wait(2);
        pageHYBS.blacklist.click();

    }
    @Given("click black list radiobutton and black list")
    public void click_black_list_radiobutton_and_black_list() {
        pageHYBS.cleancompanylist.click();
        Assert.assertTrue(pageHYBS.cleancompanyEVET.isDisplayed());
        ReusableMethods.wait(2);
        pageHYBS.cleancompanylist.click();
    }


    @Given("When the user clicks on the SearchBoxes one by one, a listing should be made according to the categories to be searched.\"")
    public void when_the_user_clicks_on_the_search_boxes_one_by_one_a_listing_should_be_made_according_to_the_categories_to_be_searched() {


        subjectText = "BALOĞLU YAPI";
        pageHYBS.firmasearchbox.sendKeys(subjectText);
        String expectedAranan=subjectText;
        String actualAranan=pageHYBS.quicksearchverigeldimi.getText();
        Assert.assertTrue(actualAranan.contains(expectedAranan));
        ReusableMethods.wait(1);




    }


}
