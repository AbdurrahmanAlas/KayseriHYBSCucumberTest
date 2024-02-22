Feature: US_003 When the user has climbed to the company, the relevant titles should be able to display and click.
  # Kullanıcı FİRMA LİSTESİ başligina tikladiginda ilgili başlıklar görüntülenebilmeli ve tıklanabilmeli
  @tc03
  Scenario: TC_0301  When clicking on the company list, information about the company should be listed.
   # Firma listesine tıklandıgında firma ile ilgili  bilgiler listelenmelidir.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."


    # "1. Login to HYBS site, click the Login button and log in with your User
    #2.Kullanici ISLETME MODÜLÜNE tiklayabilmeli
    #3.Kullanici FİRMA LİSTESİ linkine tiklar ve ilgili sayfaya gittigi test edilir firmalar ile ilgili bilgiler listelendigi test edilir"

  Scenario: TC0302 When the group dropdown is clicked on the company list, the relevant categories should be opened
  and when clicked to the relevant category, it should be determined that the companies belonging to that category are listed

      # Firma listesinde Grup dropdownına tıklandıgında ilgili Kategoriler acılmalı
          # ve ilgili kategoriye tıklandıgında o kategoriye ait firmaların listelendigini tespit edilmelidir
    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click group dropdown

    # 22.02 persembe burda kaldım hata alıyorum dropdowna tıklamıyor
    * Verifies that category dropbox options are visible and selectable