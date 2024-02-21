Feature:While the user is on the homepage, the titles belonging to the HYBS system should be able to display and click and be able to test the relevant position.
       # Kullanıci Anasayfada iken HYBS sistemine ait olan başlıklar görüntülenebilmeli ve tıklanabilmeli ve ilgili başlıga gidildigi test edilebilmeli


  Scenario: TC_001 Home, processing module, demand lists,
  water and k.i.Talep lists should appear and click and click on the relevant part
    # AnaSayfa,İsletme Modülü, Talep Listeleri,Su ve K.İ.Talep listeleri  linkleri görünmeli ve tıklanmalı VE ilgili kısma gectigi tespit edilmeli


    * Login to HYBS site, click the Login button and log in with your User information.
    * The Home Page, Business Module, Request Lists, Water, and Sanitation Request Lists links should be visible and clickable.
    * It should be verified that the user navigates to the Home Page, Business Module, Request Lists, Water, and Sanitation Request Lists links.
    * verify that the HomePage link opens
    * verify that the BusinessModule link opens
    * verify that the RequestLists link opens
    * verify that the WaterandSanitation Request Lists link opens




 #  "1-Login to HYBS site, click the Login button and log in with your User information.
 # 3.AnaSayfa,İsletme Modülü, Talep Listeleri,Su ve K.İ.Talep listeleri  linkleri görünmeli ve tıklanmalı
 # 4.AnaSayfa,İsletme Modülü, Talep Listeleri,Su ve K.İ.Talep listeleri  linklerine gectigi dogrulanmalı"


  @tc2301
  Scenario: TC_002 Work processes, water and that work processes, casting site movements,
  small vehicles should appear and click on the link and determine the relevant part
    #İs sürecleri,Su ve Kİ iş sürecleri,Döküm sahası hareketleri ,Kücük Arac görünmeli ve linke tıklanmalı VE ilgili kısma gectigi tespit edilmeli

    * Login to HYBS site, click the Login button and log in with your User information.
    * Work processes, Water and KI work processes, Dump site movements, Small Tool links should be visible and clicked.
    * verify that the Work processes link opens
    * verify that the Water and KI work processes link opens
    * verify that the Small Tool link opens


    # "1Login to HYBS site, click the Login button and log in with your User
    # 2.İs sürecleri,Su ve Kİ iş sürecleri,Döküm sahası hareketleri ,Kücük Arac  linkleri görünmeli ve tıklanmalı
    # 3.İs sürecleri,Su ve Kİ iş sürecleri,Döküm sahası hareketleri ,Kücük Arac  linklerine gectigi dogrulanmalı"
    # * İş süreçleri bağlantısının açıldığını doğrulayın
    #   * Su ve KI iş süreçleri bağlantısının açıldığını doğrulayın
    #   * Küçük Araç bağlantısının açıldığını doğrulayın
  @tc2301
  Scenario: TC_003 Storage and Casting, Financial List, Reports, Vehicle Tracking System links should
  appear and be clicked AND it should be determined that it moves to the relevant section.

    * Login to HYBS site, click the Login button and log in with your User information.
    * Storage and Casting, Financial List, Reports, Vehicle Tracking System links should appear and be clicked.
    * verify that the Stoage and Casting link opens
    * verify that the Financial link opens
    * verify that the Reports opens
    * verify that the Vehicle Tracking opens