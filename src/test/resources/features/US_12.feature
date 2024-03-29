
  Feature: US_012 When the "User Request Lists/Building Permit Request" title is clicked, the functions on the page should work correctly.
       # Kullanici Talep Listeleri/YAPI RUHSAT TALEBİ basligina tiklanildiginda sayfadaki islevler düzgün calismalidir

    Scenario:TC_01201 BUILDING PERMIT REQUEST is clicked, the information related to the added building permits should be listed.
    It should be verified that the search is performed correctly in the search boxes.
      # YAPI RUHSAT TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  bilgiler listelenmelidir.
      #Searchboxlarda arama yaptıgında dogru bir şekilde arandıgı kontrol edilir

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on BUILDING PERMIT REQUEST
      * t should be verified that the building permit request page has been opened.
    @01102
    Scenario:TC_01202 BUILDING PERMIT REQUEST is clicked, the information related to the added building permits should be listed.
    It should be verified that the search is performed correctly in the search boxes.
      # YAPI RUHSAT TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  bilgiler listelenmelidir.
      #Searchboxlarda arama yaptıgında dogru bir şekilde arandıgı kontrol edilir

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on BUILDING PERMIT REQUEST
      * User should be able to click on NEW BUILDING PERMIT REQUEST BUTTON
      * Enter the information related to the new building permit request and click on the create button.