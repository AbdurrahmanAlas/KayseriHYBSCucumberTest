
  Feature: US_016 The functions on the page must work properly in the KÜCÜKARAC module.
    # KÜCÜKARAC modülünde  sayfadaki islevler düzgün calismalidir
    Scenario: TC_01601 When the ADD SMALL VEHICLE button is clicked, the required
    information must be entered and it must be verified that it has been added correctly.
      # KÜCÜK ARAC EKLE butonuna tıklandıgında gerekli bilgiler
          # girildiginde dogru bir şekilde eklendigi dogrulanmalı

      Given Login to HYBS site, click the Login button and log in with your User information.
