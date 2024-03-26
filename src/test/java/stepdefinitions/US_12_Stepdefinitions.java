package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

import static utilities.Driver.driver;

public class US_12_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();

    @Given("User should be able to click on BUILDING PERMIT REQUEST")
    public void user_should_be_able_to_click_on_buıldıng_permıt_request() {

        pageHYBS.talepListeleriLink.click();
        pageHYBS.talepListeleriYAPI_RUHSATLI_Link.click();


    }
    @Given("t should be verified that the building permit request page has been opened.")
    public void t_should_be_verified_that_the_building_permit_request_page_has_been_opened() {

        String expectedUrl="https://kayserihybs.n2mobil.com.tr/hafriyat/license/list";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);



    }

    @Given("User should be able to click on NEW BUILDING PERMIT REQUEST BUTTON")
    public void user_should_be_able_to_click_on_new_buıldıng_permıt_request_button() {

        pageHYBS.talepListeleri_NEW_BUILDING_BUTTON.click();


    }


    @Given("Enter the information related to the new building permit request and click on the create button.")
    public void enter_the_information_related_to_the_new_building_permit_request_and_click_on_the_create_button() {

        pageHYBS.companyList_DROPDOWN.click();
        pageHYBS.Yapı_Ruhsatı_Talebi_DROPDOWN_INPUT.sendKeys("Gecici"+Keys.ENTER);

        ReusableMethods.wait(2);

        pageHYBS.Yapı_Ruhsatı_Talebi_YENIYAPI_DROPDOWN.click();
        pageHYBS.Yapı_Ruhsatı_Talebi_YENIYAPI_DROPDOWN_INPUT.sendKeys("Dolgu"+Keys.ENTER);

        pageHYBS.Yapı_Ruhsatı_Talebi_RUHSAT_NO.sendKeys("123456");
        pageHYBS.Yapı_Ruhsatı_Talebi_BULTEN_NO.sendKeys("4545435435");
        ReusableMethods.wait(2);

        pageHYBS.Yapı_Ruhsatı_Talebi_DATE.click();

        // Seçim kutusu içindeki input alanını bul
        WebElement searchInput = driver.findElement(By.className("select2-search__field"));

        // Input alanına yazı gönder
        searchInput.sendKeys("aa"+Keys.ENTER);



        pageHYBS.Yapı_Ruhsatı_Talebi_URETICI_NAME.sendKeys("Denemeuretici");
        pageHYBS.Yapı_Ruhsatı_Talebi_URETICI_PHONE.sendKeys("0542525252");
        pageHYBS.Yapı_Ruhsatı_Talebi_vergı_no.sendKeys("222222");
        pageHYBS.Yapı_Ruhsatı_Talebi_ADDRES.sendKeys("Sanayi mahallesi Deneme");
        pageHYBS.Yapı_Ruhsatı_Talebi_ADA.sendKeys("34");
        pageHYBS.Yapı_Ruhsatı_Talebi_PARSEL.sendKeys("25");
        pageHYBS.Yapı_Ruhsatı_Talebi_BLOCK.sendKeys("FEVZİ ÇAKMAK");

        ReusableMethods.wait(3);
ReusableMethods.scrolldown_600();
        ReusableMethods.wait(3);
        pageHYBS.Yapı_Ruhsatı_Talebi_ILCEDROPDOWN.click();
        ReusableMethods.wait(1);
        pageHYBS.Yapı_Ruhsatı_Talebi_ILCEDROPDOWNINPUT.sendKeys("Yahyalı");
        ReusableMethods.scrolldown_600();
        pageHYBS.Yapı_Ruhsatı_Talebi_MAHALLEDROPDOWN.click();
        pageHYBS.Yapı_Ruhsatı_Talebi_MAHALLEDROPDOWNINPUT.sendKeys("Kavacık"+Keys.ENTER);

        ReusableMethods.scrolldown();

        pageHYBS.Yapı_Ruhsatı_Talebi_KAZIMIKTARI.sendKeys("300");
        pageHYBS.Yapı_Ruhsatı_Talebi_DOLGUMIKTARI.sendKeys("500");
        pageHYBS.Yapı_Ruhsatı_Talebi_BOSKAZIMIKTARI.sendKeys("700");

        ReusableMethods.wait(3);
        ReusableMethods.scrolldown_600();

        pageHYBS.Yapı_Ruhsatı_Talebi_ATIKCINSIDROPDOWN.click();
        pageHYBS.Yapı_Ruhsatı_Talebi_ATIKCINSIDROPDOWN_INPUT.sendKeys("İnşaat Yıkıntı Toprağı");
        pageHYBS.Yapı_Ruhsatı_Talebi_ATIKMIKTARI.sendKeys("202292");
        ReusableMethods.wait(2);
        ReusableMethods.scrolldown_600();

        pageHYBS.Yapı_Ruhsatı_Talebi_DOKUMSAHALARIDROPDOWN.click();
        pageHYBS.Yapı_Ruhsatı_Talebi_DOKUMSAHALARIDROPDOWN_INPUT.sendKeys("Akin Döküm Sahası");

        pageHYBS.Yapı_Ruhsatı_Talebi_HAFRIYATADRESS.sendKeys("DENEME");
        pageHYBS.Yapı_Ruhsatı_Talebi_HAFRIYATNOTE.sendKeys("denemem");
        pageHYBS.Yapı_Ruhsatı_Talebi_DOKUMANADI.sendKeys("DENİYORUZZZZZZZZZZZZZZZZ");



        WebElement dosyaSecButonu = driver.findElement(By.xpath("(//input[@id=\"id_path\"])[1]"));

        String yuklenecekDosyaYolu = System.getProperty("user.home") +
                "\\Desktop\\resimler\\deneme.jpeg";

        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);

        ReusableMethods.wait(5);
    }

}
