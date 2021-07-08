Feature: Validate place if the place is added

  @LoginAccesstoken
  Scenario Outline: Generate authentication key
    Given I run the "Authentication" api
    When User calls "AddApI" with post http request
    #When the same line can be used for differnet fucntions
    Then the Api call is success with status code 200
    And status in response is OK
    Examples:
      |Authentication| AddApI|
      |MjU4ODkyMjIyMjIwOmNhc2lubzEy|


  @PlayerAccount
    Scenario Outline: Get balances
      When User calls "AddApI" with post http request
    #When the same line can be used for differnet fucntions
      Then the Api call is success with status code 200
      And status in response is OK
      Examples:
        |  |

  @GeBalance
  Scenario Outline: Get account details
    When User calls "AddApI" with post http request
    #When the same line can be used for differnet fucntions
    Then the Api call is success with status code 200
    And status in response is OK
    Examples:
      |  |

