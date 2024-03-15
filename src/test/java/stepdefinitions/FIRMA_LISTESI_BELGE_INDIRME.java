package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;

import static utilities.Driver.driver;

public class FIRMA_LISTESI_BELGE_INDIRME {

    PageHYBS pageHYBS = new PageHYBS();
    Actions actions = new Actions(Driver.getDriver());

    @Given("click on the companyDocuments")
    public void click_on_the_company_documents() {

        pageHYBS.companyDocumentsLink.click();
        ReusableMethods.wait(2);
        actions
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        ReusableMethods.wait(2);


    }

    @Given("The ability to download documents from the document list should be tested.")
    public void the_ability_to_download_documents_from_the_document_list_should_be_tested() {

        // Tüm "Görüntüle" butonlarını bul
        List<WebElement> viewButtons = driver.findElements(By.cssSelector("a[data-original-title='Görüntüle']"));

        // Her bir "Görüntüle" butonu için döngü
        for (WebElement button : viewButtons) {
            // Butona tıkla
            button.click();

            // Resmi çek
            WebElement imageElement = driver.findElement(By.cssSelector("img[class='img-responsive']"));
            String imageURL = imageElement.getAttribute("src");

            // Resmi indir ve kaydet
            try {
                File file = new File("image_" + System.currentTimeMillis() + ".png");
                org.apache.commons.io.FileUtils.copyURLToFile(new java.net.URL(imageURL), file);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Geriye dön
            driver.navigate().back();
        }
    }
}



