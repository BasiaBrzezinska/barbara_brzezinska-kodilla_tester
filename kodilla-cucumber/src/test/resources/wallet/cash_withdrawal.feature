Feature: Cash withdrawal

  Scenario Outline: Withdrawal various sum from wallet
    Given I have deposited $200 in my wallet
    When I request $<requested>
    Then $<dispensed> should be dispensed

    Examples:
    | requested | dispensed |
    | 30        | 30        |
    | 300       | 0         |
    | 200       | 200       |
    | 0         | 0         |
    | -50       | 0         |

