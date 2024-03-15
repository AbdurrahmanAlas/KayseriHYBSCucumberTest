

  Feature:  When clicking on the "Company List", all elements in the list should have their "Inspect" buttons clicked, and then the "COMPANY DOCUMENTS AND VEHICLE DOCUMENTS"
    links should be clicked, and the documents related to the company should be downloaded to the computer.
   # Firma listesine tıkladıgında listede bulunan bütün elemanların incele butonuna tıklanıp FİRMA BELGELERİ VE ARAC BELGELERİ
     # linklerine tıklanıp firmaya ait belgeler Bilgisayara indirilmelidir.   ingilizcesini yaz
  @firma
    Scenario: Clicking on the company list, all elements in the list should have their "Inspect" buttons clicked, and then the
    "COMPANY DOCUMENTS" link should be clicked, and the documents should be downloaded to the computer.
      # Firma listesine tıkladıgında listede bulunan bütün elemanların incele butonuna tıklanıp
        # FİRMA BELGELERİ linkine tıklanır ve belgeler bilgisayara indirilmeli
      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      * click on the inspect eye icon
      * click on the companyDocuments
      * The ability to download documents from the document list should be tested.