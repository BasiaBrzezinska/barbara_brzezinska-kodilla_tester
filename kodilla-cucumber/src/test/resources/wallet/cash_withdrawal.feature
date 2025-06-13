Feature: Cash withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Withdrawal amount more than balance
    Given I have deposited $200 in my wallet
    When  I request $300
    Then $0 should be dispensed

  Scenario: Withdrawal from wallet exactly what is the balance
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed

  Scenario: Withdrawal zero dollars
    Given I have deposited $200 in my wallet
    When I request $0
    Then $0 should be dispensed

  Scenario: Attempt to withdraw a negative amount
    Given I have deposited $200 in my wallet
    When I request $-50
    Then $0 should be dispensed
