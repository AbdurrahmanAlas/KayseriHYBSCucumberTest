package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PageTrend;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_1_Stepdefinitions {

    PageTrend pageTrend=new PageTrend();


    @Given("User goes to {string} page and The subscribe popup is closed")
    public void userGoesToPageAndTheSubscribePopupIsClosed(String arg0) {

        ReusableMethods.enterPageAndClosePopUp();

    }
    @Then("it is verified that it went to the requested page")
    public void it_is_verified_that_it_went_to_the_requested_page() {

        String expectedUrl="https://qa.trendlifebuy.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

    }
    @Then("close page")
    public void close_page() {


        Driver.quitDriver();


    }


    @Then("Checks on the homepage that the title is Trendlifebuy Online Shopping")
    public void checksOnTheHomepageThatTheTitleIsTrendlifebuyOnlineShopping() {

        String expectedTitle="Trendlifebuy Online Shopping";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }



}
