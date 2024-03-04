
  Feature: US_004 When the user clicks on the BusinessModule/CompanyList/REVIEW(eye) button, the functions on the page should work properly.
    #Kullanici İsletmeModulu/FirmaListesi/İNCELE(göz) butonuna tikladiginda sayfadaki islevler düzgün calismalidir


    Scenario:"TC_0401 When the REVIEW (eye) button of any company is clicked, it should be directed to the page containing the DETAILS of that company.
    Company Name and Registration number should appear."
   # Herhangi bir firmaya ait İNCELE (göz) butonu tıklandığında o firmanın DETAYLARININ yer aldığı sayfaya yönlendirilmelidir.
   #    Şirket Adı ve Sicil numarası görünmelidir."

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      *  click on the inspect eye icon
      *  Company Name and Registration number must appear.

    @tc07
      Scenario: "TC_0402 The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST buttons should be visible and their functions should work properly when clicked.
        # Firmaya ait BAKİYE, ATS BELGE SÜRESİ UZAT ,KARALİSTEYE AL butonlari görüntülenebilmeli ve tiklandiginda fonksiyonlari düzgün calisabilmelidir

        Given Login to HYBS site, click the Login button and log in with your User information.
        * User should be able to click on OPERATION MODULE
        * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
        *  click on the inspect eye icon
        *  The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST buttons should be visible
        * The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST and their functions should work properly when clicked.