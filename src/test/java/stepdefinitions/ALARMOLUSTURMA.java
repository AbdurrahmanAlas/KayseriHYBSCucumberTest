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

        String[] firmalar = {
                "ABDULLAH AYASILI",
                "ADEM BÖLÜKBASI",
                "AHMET ADANALI",
                "AHMET CEM KIS",
                "AHMET İLHAN",
                "AHMET KARAKAYA",
                "AHMET ÖNDER SOYKAN",
                "AHMET ŞANLITÜRK",
                "AHMET TURHAN CENNET",
                "AHMET YASMAN",
                "AKKAS HAFRİYAT",
                "AKMICIR HAFRİYAT",
                "ALAADDİN DEVİR",
                "ALİ ANTAL",
                "ALİ İHSAN SOLMAZ",
                "ALPASLAN DENİZ",
                "ALTERNATİF PLAN PROJE",
                "ALTINKAYA GRANİT",
                "ALTINKAYA GRANİT MERMERCİLİK LTD ŞTİ.",
                "ALTUNTAŞ HAFRİYAT NAK. İNŞ.",
                "ARABOGLU NAKLİYE TASIMACILIK",
                "ARVEN YAPI A.S",
                "ASÇELİK PETROL NAKLİYAT İNŞAAT ORMAN ÜRÜNLERİ TURİZM MADENCİLİK SANAYİ VE TİCARET LİMİTED ŞİRKETİ",
                "ASLANLAR HAFRİYAT",
                "ASMEN İNŞAAT",
                "ATAY İNŞAAT",
                "AYAZ HAFRİYAT (Mehmet Ayaz)",
                "AYDIN ASLAN",
                "AYDIN İNŞAAT TİC.",
                "BAĞCI HAFRİYAT(Abdurrahman Bağcı)",
                "BAHRİ BEKTAS",
                "BALOGLU HAFRİYAT İNŞ.NAK.LTD.ŞTİ.",
                "BALOGLU YAPI MLZ.İNŞ.NAK.GID.LTD. ŞTİ.",
                "BAŞKA İNŞAAT",
                "BEMKAY İNŞAAT",
                "BERAT KOÇ",
                "BKN HURDACILIK",
                "CAHİT BAŞBEK",
                "CAN KARDEŞLER(Cengiz Özdemir)",
                "CEMAL SIR",
                "CEVDET TİREN",
                "CİHAN YAPI",
                "CLS HAFRİYAT",
                "CM HAYVANCILIK",
                "COŞKUN GÜRPINAR",
                "CUMA ALİ ÖZDEMİR",
                "CUMA TURHAN",
                "ÇAĞLAYANGİL ELEKTRİK , İNŞAAT LTD.ŞTİ.",
                "ÇARIKLI İNŞ.TAAHHÜT NAK.İŞ MAK LTD ŞTİ",
                "ÇIBIK HAFRİYAT",
                "DELEN MADENCİLİK VE İNŞAAT A.Ş",
                "DOK HAFRİYAT VE OTO GALERİ",
                "DOKOĞLU HAFRİYAT(Ali Dok)",
                "DÖNEM MADENCİLİK",
                "DURAN DOK",
                "DURAN DURSUN",
                "DURMUŞ TOPAL",
                "EGE CEVHER KROM MADENCİLİK SANAYİ VE TİCARET LİMİTED ŞİRKETİ",
                "EJDER MADEN",
                "ELMAS MÜRAT",
                "EMİN ALDEMİR",
                "EMİN HUBUBAT",
                "EMİNE KIŞ NAKLİYAT",
                "EMİROĞLU İNŞ.MADEN.LTD ŞTİ.",
                "EMRE TAŞ VE MADENCİLİK A.Ş.",
                "ENES HAFRİYAT(Oktay Kaygısız)",
                "ERDAG HAFRİYAT",
                "ERDAL TOPLAK",
                "ERDOĞAN DEMİR",
                "ERDOĞAN ISIK",
                "ERKUT İNSAAT",
                "EROL TİREN",
                "ERSE HAFRİYAT",
                "ERSOY MERMER MADEN",
                "ETHEM İLTAŞ HAFRİYAT",
                "FARUK DİKMEN",
                "FAZLI ŞEKER",
                "FELEK HAFRİYAT",
                "FEYYAZ SERÇEL",
                "FEYZULLAH IŞIK İNŞAAT",
                "FIRAT HAFRİYAT",
                "FIRAT NAKLİYE",
                "FURKAN KÖK UZUNOĞLU HAFR.",
                "GEMA İNŞ.NAK.TİC.LTD.ŞTİ.",
                "GÖKHAN TURHAL",
                "GÖNDER HAFRİYAT",
                "GÜÇLÜ İNŞAAT",
                "GÜRPINAR HAFRİYAT",
                "HACI ALİ SERÇEL",
                "HACI BEKİR ÖZTÜRK",
                "HACI MEHMET AHRAZ",
                "HAKAN DAGLI",
                "HAMZA TOPRAKTAS",
                "HANSOY",
                "HARBİYE İNŞ. MAD. TAAH. PET. ÜRN. SAN. TİC. A.Ş",
                "HARUN BALLIKAYA",
                "HASAN RAYDEMİR",
                "HAYRİ DAGLI HAFRİYAT",
                "HİDAYET FIRAT NAKLİYE",
                "HÜSAMETTİN TOZKOPARAN",
                "HÜSEYIN ATAMAN",
                "HÜSEYİN DAĞLI",
                "İBRAHİM KOÇ",
                "İHSAN ATMACA",
                "İHSAN GÖN",
                "İLHAN YEREBASMAZ",
                "İLTAŞ HAFRİYAT",
                "İLTAŞOĞLU HAFRİYAT(Mehmet İltaş)",
                "İNOVASYON HAFRİYAT",
                "İSMAİL DEMİR",
                "İSMET AKKURT",
                "İTİMAT MERMER",
                "KAMER MERMER A.Ş.",
                "KARAKIZ NAKLİYE",
                "KARARMAZ ELEKTRİK",
                "KAYSERİ HAFRİYAT",
                "KEMER NAKLİYAT",
                "KERİM DAG",
                "KEZİBAN UYGUN",
                "KIZILIRMAK NAKLİYE",
                "KİPER MAKİNA",
                "KORAY ALTINBAŞ",
                "KUBİLAY KILIÇ",
                "KUMRULAR HAFRİYAT",
                "LAZOLİNİ MADEN SAN.VE TİC.ANONİM ŞİRK.",
                "LOKMAN ÖZ",
                "MAHMUT BAĞLAMIŞ",
                "MAHMUT ÇALDAŞ",
                "MAHMUT TOPAL",
                "MASTARCIOĞLU",
                "MAYA NAKLİYAT",
                "MEHMET ÇETİNKAYA",
                "MEHMET FATİH ARIKAN",
                "MEHMET KOÇYİĞİT NAKLİYAT",
                "MEHMET SİNAN",
                "MEMİŞ OLGUN",
                "MERT TAM HAFRİYAT",
                "MUHAMMED DEMİREZEN",
                "MUHSİN DEMİREL",
                "MUSTAFA ARSLAN",
                "MUSTAFA AYDOĞMUS",
                "MUSTAFA BAKAÇ",
                "MUSTAFA DOĞAN YAPI GRANİT LTD.ŞTİ.",
                "MUSTAFA DURSUN",
                "MUSTAFA GÜNDÜZ",
                "MUSTAFA KANAL",
                "MUSTAFA KAZU",
                "MUSTAFA PARLAK",
                "MUSTAFA UYGUN",
                "MÜKREMİN GENÇ",
                "NAZMİ DURSUN",
                "NEV-KA DİYABAZ BAZALT MAD.LTD.ŞTİ",
                "NİHAT DOĞRU",
                "NİZAMETTİN HÖYÜK",
                "NUH FELEK",
                "NURİ RAYDEMİR",
                "NUSRETTİN ERCİYES",
                "OKANDAN CAM",
                "OKTAY PEHLİVAN",
                "OKYANUS OTO KURTARMA",
                "ONUR TORNA",
                "OSMAN TEK",
                "ÖZDOKLAR HAFRİYAT",
                "ÖZGE HAFRİYAT(Adem Çaldaş)",
                "ÖZTASLAR İNSAAT",
                "ÖZYILAN HAFRİYAT",
                "PAŞA HAFRİYAT(Hilmi Toktay)",
                "PAYZA DÖKÜM",
                "PEHLİVAN HAFRİYAT(Ali Pehlivan)",
                "RIZA TÜRKMEN",
                "SABAN DURSUN(M. DURSUN)",
                "SADIK DURAN",
                "SALİM ALTUNTAŞ",
                "SAŞOĞLU İNŞ.SAN.TİC.LTD.ŞTİ.",
                "SATO",
                "SEKER HAFRİYAT(Faruk Şeker)",
                "SELAHATTİN AYASILI",
                "SELİN KANEPE KOLTUK",
                "SERİFE DAGLI",
                "SERVET KAPLAN",
                "SEYİT KAYNAR",
                "SEYİTOĞULLARI İNŞAAT NAKL. SAN VE TİC",
                "SOLMAZLAR NAK.AKARYAKIT İNŞ.LTD.ŞTİ.",
                "SUNGUR İNŞAAT",
                "SUNULLAH SERÇEL",
                "SÜLEYMAN SORGUN",
                "ŞARLI HAFRİYAT",
                "ŞARLI MÜHENDİSLİK",
                "ŞİRİN TAŞKIRAN",
                "TOTAS DOGALGAZ",
                "TUNCAY SOYAL",
                "TURHAL HAFR.İNŞ.SAN VE TİC. LTD. ŞTİ",
                "TURKUAZ SERAMİK SAN.VE TİC.A.Ş.",
                "UĞUR GÜLÜNÇ",
                "UZUNOĞLU HAFRİYAT(MESE HAFRİYAT)",
                "ÜLKER İNŞAAT",
                "ÜNLÜLER TURİZM",
                "VELİ ÇAĞLAYAN",
                "YAĞMUR HAFRİYAT(Şaban Talip)",
                "YAHYA KEMER",
                "YAĞMURALP LTD",
                "YAKUP AŞKIN",
                "YAKUP KAYA",
                "YASA İNŞAAT NAK.TUR.TİC.LTD.ŞTİ.",
                "YERGİNLER HAFRİYAT",
                "YETER DAĞLI",
                "YILANOĞLU HAFRİYAT",
                "YILDIRIM HAF.",
                "YÖRÜKOĞLU(SeyitDok)",
                "YUSUF AYDINAK",
                "YUSUF KAPLAN",
                "YUSUF SÖNMEZ",
                "YUSUF ŞAŞOĞLU",
                "YUSUF ZAVAR"

        };


        String[] alarmTurleri = {"Pasif", "Cihaz Müdahele", "Giriş Cihazı", "Kapı Açılma"};

        // Her bir firma için alarmların oluşturulması işlemi
        for (String firma : firmalar) {
            boolean aracVarMi = aracVarMi(firma); // Her firmanın aracı olup olmadığını kontrol et
            // Her bir alarm türü için işlemleri gerçekleştir
            for (String alarmTuru : alarmTurleri) {
                olusturAlarm(firma, alarmTuru, aracVarMi);
            }
        }
    }

    public boolean aracVarMi(String firmaAdi) {
        // Firma adına göre aracın varlığını kontrol et ve buna göre boolean değer döndür
        // Örnek bir kontrol yapısı:
        if (firmaAdi.equals("Firma1") || firmaAdi.equals("Firma2")) {
            return true; // Arac var
        } else {
            return false; // Arac yok
        }
    }

    public void olusturAlarm(String firmaAdi, String alarmTuru, boolean aracVarMi) {
        PageN2MOBIL pageN2MOBIL = new PageN2MOBIL();
        pageN2MOBIL.alarmbuttonlink.click();
        pageN2MOBIL.dropdownFırmalar.click();
        pageN2MOBIL.DropdownINPUT.sendKeys(firmaAdi + Keys.ENTER);
        pageN2MOBIL.alarmCLICK.click();
        pageN2MOBIL.yeniAlarm.click();
        ReusableMethods.wait(2);

        if (aracVarMi) {
            pageN2MOBIL.TumunuSecDropdown.click();
        }

        pageN2MOBIL.DropdownALARMLAR.click();
        ReusableMethods.wait(2);
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
        driver.navigate().refresh();
        ReusableMethods.wait(5);
    }

}









