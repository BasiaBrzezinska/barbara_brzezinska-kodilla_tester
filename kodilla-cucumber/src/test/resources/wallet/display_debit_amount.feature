Feature: Display debit amount

  Scenario: User withdraws money and sees the confirmation
    Given There is $100 in the wallet
    When I tried to withdraw $50
    Then The message should be "You have withdrawn $50"