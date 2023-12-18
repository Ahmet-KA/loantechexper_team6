@withdrawals
Feature: Admin  Withdrawals menu ve alt baslıklarına ulasabilmelidir

  Scenario: TC01-Admin Panelde  Withdrawal menusu goruntulenme testi

    Given kullanici browserı acar
    And  ilgili "adminUrl" e gider
    And gecerli "adminname" ve "password" ile sisteme giris yapar
    Then sol tarafta bulunan Withdrawals menusunun goruntulendigini dogrular
    And sayfayı kapatır


  Scenario: TC02-Withdarawal menusu alt baslıklarının goruntulenmesi testi

    Given kullanici browserı acar
    And  ilgili "adminUrl" e gider
    And gecerli "adminname" ve "password" ile sisteme giris yapar
    Then sol tarafta bulunan Withdrawals menusune tıklar
    And Withdrawals menusu altında Withdrawal Methods baslıgının goruntulendigini  dogrular
    And Withdrawals menusu altında Pending Withdrawals baslıgının goruntulendigini  dogrular
    And Withdrawals menusu altında Approved Withdrawals baslıgının goruntulendigini  dogrular
    And Withdrawals menusu altında Rejected Withdrawals baslıgının goruntulendigini  dogrular
    And Withdrawals menusu altında All Withdrawals baslıgının goruntulendigini  dogrular
    And sayfayı kapatır

  Scenario: TC03-Withdrawal menusu alt baslık sayfalarına erisim testi

    Given kullanici browserı acar
    And  ilgili "adminUrl" e gider
    And gecerli "adminname" ve "password" ile sisteme giris yapar
    Then sol tarafta bulunan Withdrawals menusune tıklar
    And acılan menude Withdrawal Methods baslıgına tıklayarak ilgili sayfaya gidildigini dogrular
    And geri gelir Pending Withdrawals baslıgına tıklayarak ilgili sayfaya gidildigini dogrular
    And geri gelir Approved Withdrawals baslıgına tıklayarak ilgili sayfaya gidildigini dogrular
    And geri gelir Rejected Withdrawals baslıgına tıklayarak ilgili sayfaya gidildigini dogrular
    And geri gelir All Withdrawals baslıgına tıklayarak ilgili sayfaya gidildigini dogrular
    And sayfayı kapatır