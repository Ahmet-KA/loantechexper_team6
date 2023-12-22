Feature:Loans menu basligi altindaki "Rejected Loans" sayfa linkine tiklandiginda
  "Rejected Loans" sayfasina erisilmelidir.

  Scenario:"Rejected Loans" sayfa linkine tiklanir ve  "Rejected Loans" sayfasina erisilir.

    * adminUrl sayfasina  gidilir
    * Rejected Loan sayfa linkine tiklanir  ve Reject Loans sayfasi goruntulenir
    * sayfayi kapatir

    Scenario: Sayfadaki Rejected Loans Tablosunda reddedilen krediler
    (S.N., Loan No.|Plan, User, Amount, Installment Amount, Installment, Created | Next Installment, Status  bilgileri ile ) goruntulenir.

      * adminUrl sayfasina  gidilir
      * Rejected Loan sayfa linkine tiklanir  ve Reject Loans sayfasi goruntulenir
      * S.N., Loan No.|Plan, User, Amount, Installment Amount, Installment, Created | Next Installment, Status  bilgileri goruntulenir
      * sayfayi kapatir


  Scenario: Rejected Loans sayfasindaki Rejected Loans tablosu uzerinde Loan No ve Start Date - End Date bilgileri ile arama yapilabilmelidir.

    * adminUrl sayfasina  gidilir
    * Rejected Loan sayfa linkine tiklanir  ve Reject Loans sayfasi goruntulenir
    * Loan No ve Start Date - End Date bilgileri ile arama yapilir
    * sayfayi kapatir

    Scenario: Rejected Loans tablosunda bulunan Action basligi altinda secilen kredinin Details ve Installment bilgilerine erisilebilmelidir.
      * adminUrl sayfasina  gidilir
      * Rejected Loan sayfa linkine tiklanir  ve Reject Loans sayfasi goruntulenir
      * details butonuna tıklanir details chart gorulur
      * Installment butonuna tiklanir installment chart gorulur
      * sayfayi kapatir

    Scenario: Details sayfasinda kredi detaylarina Plan, Date of Application, Loan Number,Amount,  Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status bilgilerine  erisilebilmelidir.

      * adminUrl sayfasina  gidilir
      * Rejected Loan sayfa linkine tiklanir  ve Reject Loans sayfasi goruntulenir
      * details butonuna tıklanir details chart gorulur
      * Plan, Date of Application, Loan Number,Amount,  Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status bilgilerine  erisilebilmelidir
      * sayfayi kapatir


      Scenario: Details sayfasindaki Kullanici Kredi Formu penceresinden kullanici kredi formu statusu goruntulenmelidir.

        * adminUrl sayfasina  gidilir
        * Rejected Loan sayfa linkine tiklanir  ve Reject Loans sayfasi goruntulenir
        * details butonuna tıklanir details chart gorulur
        *