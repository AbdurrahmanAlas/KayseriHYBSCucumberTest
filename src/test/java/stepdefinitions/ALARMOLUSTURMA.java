package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageN2MOBIL;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.driver;

public class ALARMOLUSTURMA {

    PageN2MOBIL pageN2MOBIL = new PageN2MOBIL();

    @Given("Login to n2MOBIL site, click the Login button and log in with your User information.")
    public void loginTon2MOBILSiteClickTheLoginButtonAndLogInWithYourUserInformation() {


        ReusableMethods.loginn2MOBIL("abddurrahman.alas", "alas.54786");
    }

    @Given("Alarmlar linkine tıkla ve yeni Alarm linkine git")
    public void alarmlar_linkine_tıkla_ve_yeni_alarm_linkine_git() {

        pageN2MOBIL.alarmbuttonlink.click();

        pageN2MOBIL.dropdownFırmalar.click();

        pageN2MOBIL.DropdownINPUT.sendKeys("ABDULLAH AYASILI" + Keys.ENTER);


        pageN2MOBIL.alarmCLICK.click();
        pageN2MOBIL.yeniAlarm.click();
        ReusableMethods.wait(4);

        pageN2MOBIL.TumunuSecDropdown.click();
        pageN2MOBIL.DropdownALARMLAR.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.DropdownALARMLAR_INPUT.sendKeys("Pasif " + Keys.ENTER);
        ReusableMethods.wait(2);

        pageN2MOBIL.DropdownBILDIRIM.click();
        pageN2MOBIL.DropdownBILDIRIM_INPUT.sendKeys("Mobil Bildirim" + Keys.ENTER);

        pageN2MOBIL.DropdownKULLANICILAR.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ramazan Korkmaz" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ozgur Yıldırım" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Furkan Kocer" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Burak Per" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Abdurrahman Alas" + Keys.ENTER);
        pageN2MOBIL.BOSLUGATIKLA.click();

        ReusableMethods.wait(2);

        pageN2MOBIL.ALARM_KAYDET.click();

        pageN2MOBIL.basarılıOK.click();

        /////////////////////////////////////////////////////////
        ReusableMethods.wait(5);

        pageN2MOBIL.yeniAlarm.click();
        ReusableMethods.wait(3);

        pageN2MOBIL.TumunuSecDropdown.click();
        pageN2MOBIL.DropdownALARMLAR.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.DropdownALARMLAR_INPUT.sendKeys("Cihaz Müdahele " + Keys.ENTER);
        ReusableMethods.wait(2);

        pageN2MOBIL.DropdownBILDIRIM.click();
        pageN2MOBIL.DropdownBILDIRIM_INPUT.sendKeys("Mobil Bildirim" + Keys.ENTER);

        pageN2MOBIL.DropdownKULLANICILAR.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ramazan Korkmaz" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ozgur Yıldırım" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Furkan Kocer" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Burak Per" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Abdurrahman Alas" + Keys.ENTER);
        pageN2MOBIL.BOSLUGATIKLA.click();

        ReusableMethods.wait(2);

        pageN2MOBIL.ALARM_KAYDET.click();

        pageN2MOBIL.basarılıOK.click();
//////////////////////////////////////////////////////

        ReusableMethods.wait(5);

        pageN2MOBIL.yeniAlarm.click();
        ReusableMethods.wait(3);

        pageN2MOBIL.TumunuSecDropdown.click();
        pageN2MOBIL.DropdownALARMLAR.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.DropdownALARMLAR_INPUT.sendKeys("Giriş Cihazı " + Keys.ENTER);
        ReusableMethods.wait(2);

        pageN2MOBIL.DropdownBILDIRIM.click();
        pageN2MOBIL.DropdownBILDIRIM_INPUT.sendKeys("Mobil Bildirim" + Keys.ENTER);

        pageN2MOBIL.DropdownKULLANICILAR.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ramazan Korkmaz" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ozgur Yıldırım" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Furkan Kocer" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Burak Per" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Abdurrahman Alas" + Keys.ENTER);
        pageN2MOBIL.DamperDROPDOWN.click();
        // Dropdown elementini locate etme
        WebElement dropdown = driver.findElement(By.xpath("//input[@placeholder='Filo Seçiniz']"));

        // "Damper" yazısını dropdown'a gönderme ve ENTER tuşuna basma
        dropdown.sendKeys("Damper" + Keys.ENTER);

        // Bekleme süresi ekleyerek sayfanın yüklenmesini sağlama
        try {
            Thread.sleep(2000); // 2 saniye bekleme süresi
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Seçilen seçeneğin doğruluğunu kontrol etme
        String selectedOptionText = dropdown.getAttribute("value");
        if (!selectedOptionText.equalsIgnoreCase("Damper")) {
            System.out.println("Seçenek mevcut değil, işleme devam ediliyor...");
        }


        pageN2MOBIL.DamperDROPDOWNwhenActive.click();

        ReusableMethods.wait(2);

        pageN2MOBIL.ALARM_KAYDET.click();

        pageN2MOBIL.basarılıOK.click();

        ///////////////////////////////////////////////////

        ReusableMethods.wait(5);

        pageN2MOBIL.yeniAlarm.click();
        ReusableMethods.wait(3);

        pageN2MOBIL.TumunuSecDropdown.click();
        pageN2MOBIL.DropdownALARMLAR.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.DropdownALARMLAR_INPUT.sendKeys("Kapı Açılma " + Keys.ENTER);
        ReusableMethods.wait(2);

        pageN2MOBIL.DropdownBILDIRIM.click();
        pageN2MOBIL.DropdownBILDIRIM_INPUT.sendKeys("Mobil Bildirim" + Keys.ENTER);

        pageN2MOBIL.DropdownKULLANICILAR.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ramazan Korkmaz" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ozgur Yıldırım" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Furkan Kocer" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Burak Per" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Abdurrahman Alas" + Keys.ENTER);
        pageN2MOBIL.BOSLUGATIKLA.click();

        ReusableMethods.wait(2);

        pageN2MOBIL.ALARM_KAYDET.click();

        pageN2MOBIL.basarılıOK.click();
    }
}



