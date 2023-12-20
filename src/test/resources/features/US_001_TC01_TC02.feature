@url
Feature: Kullanıcı siteye erisebilmeli

  Scenario: TC01 Site accessibility test

    Given kullanici browserı acar
    Given kullanici browserda  "url" e gider
    Then  sayfanın acıldıgını test eder
    And   sayfayi kapatir

  Scenario: TC02 Testing whether the home page is visible when the site is accessed
    Given kullanici browserı acar
    Given kullanici browserda  "url" e gider
    Then  acılan sayfanın Homepage oldugunu test eder
    And   sayfayi kapatir