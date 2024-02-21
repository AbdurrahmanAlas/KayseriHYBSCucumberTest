
  Feature: US01 As a user I should be able to access the home page
# Kullanıcı Anasayfa LOGİN sayfasına erişebilmeli  kullanıcı adı ve Sifre bilgileri ile sisteme giris yapabilmeli
    Scenario: TC_0101 The home page should be accessible when the URL is entered.

      Given Login to HYBS site, click the Login button and log in with your User information.
      Then it is verified that it went to the requested page
      Then close page




