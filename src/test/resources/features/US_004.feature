
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


      Scenario: "TC_0402 The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST buttons should be visible and their functions should work properly when clicked.
        # Firmaya ait BAKİYE, ATS BELGE SÜRESİ UZAT ,KARALİSTEYE AL butonlari görüntülenebilmeli ve tiklandiginda fonksiyonlari düzgün calisabilmelidir

        Given Login to HYBS site, click the Login button and log in with your User information.
        * User should be able to click on OPERATION MODULE
        * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
        *  click on the inspect eye icon
        *  The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST buttons should be visible
        * The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST and their functions should work properly when clicked.


    @tc07
      Scenario: TC_0403  Company Information, Company Personnel, Company Users, Company Documents, Vehicles, Vehicle Documents, Financial Transactions, TİB, Balance Movements, Call List,
      Construction Fill List, Penalty List, Complaint List, COMMITMENT links should be displayed and when the relevant title is clicked, it should be navigated smoothly.
        # Firmaya ait Bilgiler,Firma Personelleri,Firma Kullanicilari,Firma Belgeleri,Araclar,Arac Belgeleri ,Mali İslemler,TİB,Bakiye Hareketleri,Çagrı Listesi,
          # İnsaat Dolgu Listesi,Ceza Listesi , Şikayet Listesi,TAAHHÜTNAME linkleri görüntülenmeli ve ilgili başlığa tıklandıgında sorunsuz bir sekilde gidilmeli

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      *  click on the inspect eye icon
      * the user clicks on Company_Information,Company_Personnel,Company_Users,Company_Documents,Vehicles,Vehicle_Documents,Financial_Transactions,TIB,Balance_Movements,Call_List,Construction_Fill_List,Penalty_List,Complaint_List,CONTRACT link



