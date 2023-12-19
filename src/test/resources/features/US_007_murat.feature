@f07
Feature: [US_007] Bir ziyaretci olarak Loan Planlara ulasabilecegim ve secebilecegim bir sayfa olmasini istiyorum

  Background: Ziyaretci ilgili anasayfaya gider
    * Ziyaretci anasayfaya gider
    * Cookiesi kapatir


  Scenario: [TC_01 > US_007] Anasayfa Plans menusunden Loan plans sayfasina erisilebildigini dogrular.
    * Plans menusune tiklar
    * Loan sayfasina erisebildigini dogrular
    * Sayfayi kapatir


  Scenario: [TC_02 > US_007] Anasayfa footerda Loan Plans link textinin gorunur oldugunu dogrular
    * Loan Plans link textinin gorunur oldugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_03 > US_007] Anasayfa footerda Loan Plans linkinin aktif oldugunu dogrular
    * Loan Plans link textine tiklar ve aktif oldugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_04 > US_007] Basic Loan basligi altindaki Loan Plan kartlarinin gorunur oldugunu dogrular
    * Plans menusune tiklar
    * Basic Loan butonuna tiklar
    * Cookiesi kapatir
    * Loan Plan kartlarinin gorunur oldugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_05 > US_007] Loan Plan kartlarinin altinda bulunan Apply Now butonlarinin gorunur oldugunu dogrular
    * Plans menusune tiklar
    * Basic Loan butonuna tiklar
    * Apply Now butonlarinin gorunur oldugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_06 > US_007] Loan Plan kartlarinin altinda bulunan Apply Now butonlarinin aktif oldugunu dogrular
    * Plans menusune tiklar
    * Apply Now butonlarinin aktif oldugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_07 > US_007] Loan Plans Sayfasında Home \ Loan Plans linklerinin islevini dogrular
    * Plans menusune tiklar
    * Home linkinin islevini dogrular
    * Loan Plans linkinin islevini dogrular
    * Sayfayi kapatir