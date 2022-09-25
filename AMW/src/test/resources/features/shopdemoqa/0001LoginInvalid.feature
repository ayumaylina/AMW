Feature: Login Invalid ShopDemoQA

  Scenario: User invalid login to web
    When User go to Web ShopDemoQA
    And User enter invalid <username> <password>
    Then User get msg invalid
    
    Examples: 
      | username | password  |
      | Ayu      | Abdcfe34	 |
      | aYum     | Avfgr4_	 |
      | maylina  | Anbh&uj	 |
    