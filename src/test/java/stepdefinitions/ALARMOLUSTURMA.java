package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageHYBS;
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

        String[] firmalar = {
                "ABDULLAH AYASILI",
                "ADEM BÖLÜKBAŞ",
                "ADEM DURANOĞLU",
                "ADEM ÇALDAŞ - ÖZGE HAFRİYAT",
                "AHMET ADANALI",
                "AHMET CEM KIŞ",
                "AHMET DURSUN",
                "AHMET KARAKAYA",
                "AHMET TURHAN CENNET",
                "AHMET YAŞMAN",
                "AHMET ÖNDER SOYKAN",
                "AHMET İLHAN",
                "AK MICIR İNŞAAT TAAH.NAKLIYAT SANAYİ VE TİC.LTD.ŞTİ",
                "AKKAŞ HAFRİYAT",
                "AKPINAR İHTİYAÇ MADDELERİ NAKLİYE HARFİYAT TAAHHÜT İNŞAAT SANAYİ TİCARET LİMİTED ŞİRKETİ",
                "ALAADDİN DEVİR",
                "ALAATTİN LEKESİZ",
                "ALPASLAN DENİZ",
                "ALTINKAYA GRANİT MERMERCİLİK SAN. TİC. LTD. ŞTİ.",
                "ALTUNTAŞ İNOVASYON MERMER METAL SANAYİ VE TİCARET LİMİTED ŞİRKETİ",
                "ALİ DOK - DOKOĞLU HAFRİYAT",
                "ALİ PEHLİVAN - PEHLİVAN HAFRİYAT",
                "ALİ İHSAN SOLMAZ",
                "ARABOĞLU NAKLİYE TAŞIMACILIK VE OTOMOTİV SAN. TİC. LTD. ŞTİ.",
                "ARVEN YAPI ENDÜSTRİ A.Ş",
                "ARİF ÇAM",
                "ASMEN İNŞ TAAH.SAN TİC LTD ŞTİ",
                "ASÇELİK PETROL NAKLİYAT İNŞAAT ORMAN ÜRÜNLERİ TURİZM MADENCİLİK SANAYİ VE TİCARET LİMİTED ŞİRKETİ",
                "ATAY İNŞAAT",
                "AYDIN ASLAN",
                "AYDIN İNŞAAT TİC. SAN. LTD. ŞTİ.",
                "AYŞE AKTAŞ",
                "BAHRİ BEKTAŞ",
                "BALOĞLU HAFRİYAT İNŞ. NAK. YAP. MALZ. SAN. TİC. LTD. ŞTİ.",
                "BALOĞLU YAPI MALZ. İNŞ. HAR. NAK. GID. TİC. LTD. ŞTİ.",
                "BAŞKA İNŞAAT MADENCİLİK SANAYİ VE TİC LTD ŞTİ",
                "BEMKAY İNŞAAT",
                "BERAT KOÇ",
                "BKN HURDACILIK",
                "CAHİT BAŞBEK",
                "CEMAL SIR",


        };

        String[] alarmTurleri = {"Pasif", "Giriş Cihazı", "Cihaz Müdahele", "Kapı Açılma"};

        // Her bir firma için alarmların oluşturulması işlemi
        for (String firma : firmalar) {
            // Her bir alarm türü için işlemleri gerçekleştir
            for (String alarmTuru : alarmTurleri) {
                olusturAlarm(firma, alarmTuru);
            }
        }
    }

    public void olusturAlarm(String firmaAdi, String alarmTuru) {
        PageN2MOBIL pageN2MOBIL = new PageN2MOBIL();
        pageN2MOBIL.alarmbuttonlink.click();
        pageN2MOBIL.dropdownFırmalar.click();

        // Önceki firma adını temizle
        pageN2MOBIL.DropdownINPUT.sendKeys(Keys.CONTROL + "a");
        pageN2MOBIL.DropdownINPUT.sendKeys(Keys.DELETE);

        pageN2MOBIL.DropdownINPUT.sendKeys(firmaAdi + Keys.ENTER);
        ReusableMethods.wait(5);
        pageN2MOBIL.alarmCLICK.click();
        pageN2MOBIL.yeniAlarm.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.TumunuSecDropdown.click();

        pageN2MOBIL.DropdownALARMLAR.click();
        pageN2MOBIL.DropdownALARMLAR_INPUT.sendKeys(alarmTuru + " " + Keys.ENTER);
        pageN2MOBIL.DropdownBILDIRIM.click();
        pageN2MOBIL.DropdownBILDIRIM_INPUT.sendKeys("Mobil Bildirim" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR.click();
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ramazan Korkmaz" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ozgur Yıldırım" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Furkan Kocer" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Burak Per" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Abdurrahman Alas" + Keys.ENTER);
        pageN2MOBIL.BOSLUGATIKLA.click();
        pageN2MOBIL.ALARM_KAYDET.click();
        pageN2MOBIL.basarılıOK.click();
        ReusableMethods.wait(5);

    }

}



