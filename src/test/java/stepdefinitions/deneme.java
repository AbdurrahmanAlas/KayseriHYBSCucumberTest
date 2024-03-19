package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageHYBS;
import utilities.ReusableMethods;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import static utilities.Driver.driver;

public class deneme {
    PageHYBS pageHYBS=new PageHYBS();
    @Given("deneme yapıyorum")
    public void deneme_yapıyorum() {



        // Tüm "Görüntüle" butonlarını bul
        List<WebElement> viewButtons = driver.findElements(By.cssSelector("a[data-original-title='Görüntüle']"));

        // Her bir "Görüntüle" butonu için döngü
        for (int i = 0; i < viewButtons.size(); i++) {
            // En alttaki "Görüntüle" butonuna git ve tıkla
            WebElement viewButton = viewButtons.get(i);
            viewButton.click();

            // Ana pencereden yeni açılan pencereye geçiş yap
            String mainWindowHandle = driver.getWindowHandle();
            Set<String> allWindowHandles = driver.getWindowHandles();
            for (String handle : allWindowHandles) {
                if (!handle.equals(mainWindowHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }
            ReusableMethods.wait(3);
            // Ekran görüntüsü al ve kaydet
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File("screenshot_" + i + "_" + System.currentTimeMillis() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Sayfayı döndür
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.body.style.transform = 'rotate(90deg)'");

            // Yeni pencereyi kapat
            driver.close();

            // Ana pencereye geri dön
            driver.switchTo().window(mainWindowHandle);
        }

        // Tarayıcıyı kapat
        driver.quit();

































        //fdssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss

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
