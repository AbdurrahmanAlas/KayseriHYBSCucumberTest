
  Feature: US_009 When the user clicks on the 'Business Module/Penalty Commitment' title, the functions on the page should work properly.
    # Kullanici İsletmeModulu/CezaTaahhüt  basligina tiklanildiginda sayfadaki islevler düzgün calismalidir

    Scenario: TC_0901 When clicked on the 'Penalty Commitment' title, the corresponding page should open and be verified.
    In the penalty list, search should be possible by entering titles into the search boxes at the top."

      # "Ceza Taahhüt basligina tiklanildiginda ilgili sayfa acilmali tespit edilmeli
      #Ceza Listesinde üst kısımda Searchbox lara başlıklar girildiginde arama yapabilmeli"

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on CEZA_tAAHHUT_LIST
      * Perform a search using the penalty search function and verify if the search results are displayed correctly.

      # ??????????????????????? burda ki sıkıntı SEARCH KISMINDA FİRMA SECİYORUZ ARACI SECILEMIYOR İLGİLEN????? BUG VAR


    @US008
    Scenario: TC_0902 The relevant titles should be displayed in the penalty list, and the searched penalty should
    appear based on the criteria entered in the search section

      # Ceza  Listesinde ilgili baslıklar gelmelidir ve Search kisminda
          # arama yapilan kritere göre aranan ceza gelmelidir

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on CEZA_tAAHHUT_LIST
      * When searching in the penalty search, the relevant property ID should appear
  # ********************************************************

    ## burda kaldık 18.03.2024