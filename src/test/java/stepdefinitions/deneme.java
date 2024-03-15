package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageHYBS;
import utilities.ReusableMethods;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static utilities.Driver.driver;

public class deneme {
    PageHYBS pageHYBS=new PageHYBS();
    @Given("deneme yapıyorum")
    public void deneme_yapıyorum() {


        try {
            // Sayfada "İncele" düğmelerini bul
            List<WebElement> inceleButtons = driver.findElements(By.xpath("//i[@class='fa fa-eye']"));

            // Her "İncele" düğmesine sırayla tıkla
            for (int i = 0; i < inceleButtons.size(); i++) {
                // "İncele" düğmesini tekrar bul
                inceleButtons = driver.findElements(By.xpath("//i[@class='fa fa-eye']"));

                // İncele düğmesine tıkla
                inceleButtons.get(i).click();

                // Sayfada geri git
                driver.navigate().back();

                // Öğenin tıklanabilir olmasını bekleyin
                ReusableMethods.waitForClickablility(pageHYBS.ıncelebutonhepsi,10);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
