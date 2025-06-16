Feature: Display deposit amount

  Scenario: User deposits money and sees confirmation
    Given My wallet is empty
    When I deposited $100
    Then I should see "You deposited $100"