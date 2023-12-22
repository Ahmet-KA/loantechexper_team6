@brhn
Feature: Kayitli bir kullanici(User) olarak Kredi planlarimi gorebilecegim ve Kredi alabilecegim bir sayfa olmasini istiyorum

  Background: Kullanici giris islemlerini yapar
    * Kullanici anasayfaya gider "userNameBrhn" ve "userPassword" ile login olur


  Scenario: [TC_01 > US_018] Dashboard sayfasinda sol taraftaki navbar'da "Take Loan" link
  elementi bulunmali ve tiklandiginda "Loan Plans" sayfasina yonlendirmeli
    * Sol taraftaki navbar'da Take Loan menu linki bulundugunu dogrular
    * Take Loan menusune tiklar
    * Loan Plans sayfasina yonlendirildigini dogrular
    * sayfayi kapatir


  Scenario: [TC_02 > US_018]"Loan Plans sayfasinda Car Loan 2 buton tiklandiginda ""Personal Finance Loan"" card
  ve Take Minimum $2,000.00  Take Maximum $5,000.00 Per installment 4% installment interval  20 Days
  Total installment 20 bilgileri ""ve Apply Now butonu gorunur ve aktif olmali"
    * Take Loan menusune tiklar
    * Car Loans iki butonuna tiklar
    * Loan Plans Card body textlerini doğrular
    * Apply Now butonunun gorunur ve aktif oldugunu dogrular
    * sayfayi kapatir


  Scenario:[TC_03 > US_018] Apply  Now butona tiklandiginda "Apply for Personal Finance Loan" sayfasina gecilebilmeli
    * Take Loan menusune tiklar
    * Apply Now butona tiklar
    * Apply for Personal Finance Loan" sayfasina gecildigini dogrular
    * sayfayi kapatir


  Scenario:[TC_04 > US_018] "Apply for Personal Finance Loan" sayfasinda "Amount" degeri
  "Minimum Amount $2,000.00 -Maximum Amount $5,000.00" girilmeli ve
  "Confirm" buton gorunur ve aktif olmali, tiklandiginda basarili bir kayit gerceklesmelidir
    * Take Loan menusune tiklar
    * Apply Now butona tiklar
    * Confirm butonunun gorunur ve aktif oldugunu dogrular
    * Minimum Amount degeri girer
    * Confirm butonuna tiklar
    * Kayit isleminin gerceklestigini dogrular
    * sayfayi kapatir


  Scenario:[TC_05 > US_018] "Loan Plans sayfasinda ""Basic Loan"" buton tiklandiginda ""Basic Loan 1"",""Test_Loan"",""Car Loan 9""
  basliklari gorulmeli herhangi bir card'in altindaki ""Apply Now"" buton gorunur ve aktif olmali
    * Take Loan menusune tiklar
    * Basic Loana tiklar
    * Card basliklarini goruntulendigini dogrular
    * Sayfadaki Apply Now butonlarinin gorunur ve aktif oldugunu dogrular
    * sayfayi kapatir


  Scenario:[TC_06 > US_018] "Apply Now butona tiklandiginda ""Take Minimum / Take Maximum"" degerleri araliginda bir ""Amount""
  degeri girilebilmeli ""confirm"" butona tiklandiginda ""Application Form"" sayfasina yonlendirmeli"
    * Take Loan menusune tiklar
    * Basic Loana tiklar
    * Apply Now butona tiklar
    * Min Amount degeri girer
    * Confirm butonuna tiklar
    * Application Form sayfasina yonlendirildigini dogrular
    * sayfayi kapatir



  Scenario:[TC_09 > US_018] Apply buton tiklandiginda "Loan application submitted successfully" mesaji gorunmelidir.
    * Take Loan menusune tiklar
    * Basic Loana tiklar
    * Apply Now butona tiklar
    * Minimum Amount degeri girer
    * Confirm butonuna tiklar
    * Apply butonu tiklanir
    * Loan application submitted successfully mesajinin goruldugu dogrulanir
    * sayfayi kapatir


  Scenario:[TC_10 > US_018] My Loans sayfasinda yapilan islem gorunur olmalidir.
    * Sol yan barda My Loans menusune tiklanir
    * Yapilan islemin gorunur oldugu dorulanir
    * sayfayi kapatir



  Scenario:[TC_12 > US_018] My loans sayfasinda Running olan islem icin " installments " buton gorunur ve aktif olmalidir.
  Butona tiklandiginda "Loan installments" sayfasina erisilmelidir.
    * Sol yan barda My Loans menusune tiklanir
    * Running e tiklanir
    * installments buton gorunur ve aktif oldugu dogrulanir
    * sayfayi kapatir



  Scenario:[TC_14 > US_018] Taksit plani listesi goruntulenmelidir.
    * Sol yan barda My Loans menusune tiklanir
    * Running e tiklanir
    * Installments e tiklanir
    * Taksit plani listesinin gorunur oldugu dogrulanir
    * sayfayi kapatir


  Scenario:[TC_15 > US_018] Liste basliklari(S.N.,installment Date,Given On,Delay) Basliklari goruntulenmelidir.
  Liste icerisinde degerler gorunur olmalidir.
    * Sol yan barda My Loans menusune tiklanir
    * Running e tiklanir
    * Installments e tiklanir
    * Liste basliklarinin gorunur oldugu dogrulanir
    * Liste icerisinde degerlerin gorunur oldugu dogrulanir
    * Sayfayi kapatir



  Scenario:[TC_16 > US_018] My Loans sayfasindan Take Loan sayfasina gecis icin "Take Loan" buton gorunur ve aktif olmalidir.
    * Sol yan barda My Loans menusune tiklanir
    * Take Loan butonunun gorunur ve aktif oldugu dogrulanir
    * sayfayi kapatir