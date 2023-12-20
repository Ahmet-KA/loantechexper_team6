Feature: Dogru ve gecerli bilgilerle Change Password islmei gerceklestirilir
  Scenario: Dogru ve gecerli Bilgilerle  Change Password  Testi

Given ana sayfaya gidilir
Then allow Cookies tiklanir
Then ana sayfa Log in butonuna tiklanir
Then Gecerli "glyUserKullaniciAdi" ve "glyUserPassword" girilir
Then log in butonuna tiklanir
Then User Dashboard sayfasindaki Change Password butonuna tiklanir
Then Current Password alanina "glyUserPassword" girilir
 Then Password alanina "glyUserPassword" girilir
  Then Confirm Passwoord alanina "glyUserPassword" yeniden girilir
   Then CPSubmit butonuna tiklanir
   And CP Password changes succesfully yazisinin gorundugu dogrulanir


