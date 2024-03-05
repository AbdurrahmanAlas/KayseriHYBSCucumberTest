package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageHYBS;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.driver;

public class ARAC_TAKIP_SISTEMI {

    PageHYBS pageHYBS =new PageHYBS();

    @Given("Log in n2mobil to the website.")
    public void log_in_n2mobil_to_the_website() {


        ReusableMethods.TakipLoginHYBS("abddurrahman.alas","alas.54786");
        ReusableMethods.wait(3);
        pageHYBS.aractakipgirisdeOKBUTONU.click();
    }
    @Given("Access the History Tracking Module.")
    public void access_the_history_tracking_module() {

        ReusableMethods.wait(3);

   pageHYBS.aractakipsagusttekarelerisareti.click();
        pageHYBS.gecmisIzlemeRaporuLink.click();
ReusableMethods.wait(5);

    }
    @Given("Generate historical reports for all vehicles.")
    public void generate_historical_reports_for_all_vehicles() throws InterruptedException {

        PageHYBS page = new PageHYBS(driver);

       ReusableMethods.wait(10);

        List<WebElement> allFirmaOptions = page.getFirmaOptions();

        for (WebElement firmaOption : allFirmaOptions) {
           ReusableMethods.wait(10);
           ReusableMethods.waitForClickablility(pageHYBS.filoDropdown,15);

            firmaOption.click();

            List<WebElement> aracListesi = page.getAracOptions();

            for (WebElement arac : aracListesi) {
                arac.click();

                // Test işlemlerini gerçekleştir
                // Örneğin, seçili aracın özelliklerini kontrol et

                Thread.sleep(1000);
            }
        }


    }




    @Given("Verify the reports.allurereport")
    public void verify_the_reports_allurereport() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Log out.\"")
    public void log_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
