    Feature: Open MRS Electronic Medical Record

  @homeloanenquiry
    Scenario Outline: OpenMRS Register a patient
    Given I am in MRS page
    When I login to openMRS page Admin Admin123
    When Navigate for register a patient
    And I enter the registration details "<givenname>" "<middlename>" "<familyname>" "<gend>" "<day>" "<month>" "<year>" "<address1>" "<address2>" "<city>" "<state>" "<country>" "<postcode>" "<phonenumber>" "<relationtype>" "<personname>"
    Examples:
      | givenname  | middlename  | familyname  | gend    | day | month    | year| address1         | address2     | city  | state| country   | postcode| phonenumber| relationtype|personname|
      | John       | Doe         | michael     |  Male   | 24  | September| 1979| 4,suters avenue  | Marsden Park | sydney| NSW  | Australia | 2765    | 0424635839 | Parent      | george   |