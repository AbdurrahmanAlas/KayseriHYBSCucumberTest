package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.ReusableMethods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static utilities.Driver.driver;

public class US_9_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();
    @Given("User should be able to click on CEZA_tAAHHUT_LIST")
    public void user_should_be_able_to_click_on_ceza_t_aahhut_lıst() {
       pageHYBS.cezaTaahhütListLINK.click();
        ReusableMethods.AssertUrlControl("https://kayserihybs.n2mobil.com.tr/hafriyat/get_fine_list");

    }
    @Given("Perform a search using the penalty search function and verify if the search results are displayed correctly.")
    public void perform_a_search_using_the_penalty_search_function_and_verify_if_the_search_results_are_displayed_correctly() {

        // Başlangıç tarihini seçin
        WebElement startDateInput = driver.findElement(By.id("filter_s_date"));
        startDateInput.click(); // Tarih seçiciyi açmak için tıklama
        startDateInput.sendKeys("01/01/2024"); // Tarih girişi

        // Bitiş tarihini seçin
        WebElement endDateInput = driver.findElement(By.id("filter_e_date"));
        endDateInput.click(); // Tarih seçiciyi açmak için tıklama
        endDateInput.sendKeys("17/03/2024"); // Tarih girişi

        // Enter tuşuna basarak seçiciyi kapat
        endDateInput.sendKeys(Keys.ENTER);

        //  // Başlangıç tarihini seçin
     //  WebElement startDateInput = driver.findElement(By.id("filter_s_date"));
     //  startDateInput.clear();
     //  startDateInput.sendKeys("01/01/2024");

     //  // Bitiş tarihini seçin
     //  WebElement endDateInput = driver.findElement(By.id("filter_e_date"));
     //  endDateInput.clear();
     //  endDateInput.sendKeys("17/03/2024");

        pageHYBS.cezaTaahhütSEARCH_EKLEYEN_KISI.sendKeys("Özgür");


     // METHODA ALINACAK
        ReusableMethods.selectCompany(pageHYBS.companyList_DROPDOWN,pageHYBS.companyList_DROPDOWN_ıNPUT,"SUNGUR İNŞAAT(HALİL BEY)");

        pageHYBS.cezaTaahhütSEARCH_VEHICLEDROPDOWN.click();
        pageHYBS.cezaTaahhütSEARCH_VEHICLEDROPDOWN_INPUT.sendKeys(""+Keys.ENTER);

        pageHYBS.cezaTaahhütSEARCH_arabutton.click();



        ReusableMethods.wait(3);
    }



    @Given("When searching in the penalty search, the relevant property ID should appear")
    public void when_searching_in_the_penalty_search_the_relevant_property_ıd_should_appear() {

        pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys("3620");

         String expected="3620";
         String actual=pageHYBS.cezaTaahhütCEZA_LIST_geldimi.getText();

         ReusableMethods.wait(3);

         Assert.assertTrue(actual.contains(expected));


    }


    @Given("In any penalty, when the view button on the right side is clicked, images should be displayed.\"")
    public void ın_any_penalty_when_the_view_button_on_the_right_side_is_clicked_images_should_be_displayed() {

        pageHYBS.cezaTaahhütCEZA_LIST.click();
        pageHYBS.cezaTaahhütCEZA_GORUNTULEBUTTON.click();
        ReusableMethods.wait(3);

        Assert.assertTrue(pageHYBS.cezaTaahhütCEZA_RESIMGORUNDUMU.isDisplayed());


    }

    @Given("When the view button on the right side is clicked in any penalty, the image uploading page should be displayed, and images related to the penalty should be uploadable.")
    public void when_the_view_button_on_the_right_side_is_clicked_in_any_penalty_the_image_uploading_page_should_be_displayed_and_images_related_to_the_penalty_should_be_uploadable() {


            pageHYBS.cezaTaahhütCEZA_LIST.click();
            pageHYBS.cezaTaahhütCEZA_RESIMYUKLEMEBUTTON.click();

            pageHYBS.cezaTaahhütCEZA_RESIMYUKLE_DOKUMANADI.sendKeys("Deneme");
        Select select=new Select(pageHYBS.cezaTaahhütCEZA_RESIMYUKLE_DOKUMAN_DROPDOWN);
        select.selectByVisibleText("Araç Cezası");

        WebElement dosyaSecButonu = driver.findElement(By.xpath("(//input[@id=\"id_path\"])[1]"));
        /*
          dosya sec butonuna bastiktan sonra
          bilgisayardan selenium ile dosya secmemiz mumkun degil
          onun yerine
          dosyaSecButonu.sendKeys("DosyaYolu") yaparsak
          dosya secme islemi yapilmis olacaktir
         */

        String yuklenecekDosyaYolu = System.getProperty("user.home") +
                "\\Desktop\\resimler\\deneme.jpeg";



        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);

        ReusableMethods.wait(5);

        ReusableMethods.scrolldown_Action6();

        pageHYBS.cezaTaahhütCEZA_RESIMYUKLE_DOSYA_EKLE.click();
        ReusableMethods.wait(3);

        String imageUrl = "http://example.com/media/belgeler/Deneme_d67ea1fd86f243d2914867f26ba9a80c.jpeg";

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
            int responseCode = connection.getResponseCode();
            assert responseCode == HttpURLConnection.HTTP_OK : "Resim yüklenirken bir hata oluştu. HTTP response code: " + responseCode;
            System.out.println("Resim başarıyla yüklendi.");
        } catch (IOException e) {
            System.out.println("Resim yüklenirken bir hata oluştu: " + e.getMessage());
        }


    }







}
