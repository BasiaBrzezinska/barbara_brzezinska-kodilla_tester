package wallet;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);


    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assertions.assertEquals(200, wallet.getBalance());
    }

    //Scenario - happy path
    @When("I request $30")
    public void i_request_$30() {
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assertions.assertEquals(30, cashSlot.getContents());

    }

    //Scenario - withdraw more than balance
    @When("I request $300")
    public void i_request_more_than_i_have() {
        cashier.withdraw(wallet, 300);
    }

    //Scenario - withdrawal 0 from wallet
    @When("I request $0")
    public void i_request_$0() {
        cashier.withdraw(wallet, 0);
    }

    //Scenario - withdrawal negative amount
    @When("I request $-50")
    public void i_request_negative_amount() {
        cashier.withdraw(wallet, 0);
    }

    @Then("$0 should be dispensed")
    public void $0_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }

    //Scenario - withdrawal from wallet exactly what is the balance
    @When("I request $200")
    public void i_request_exactly_how_is_balance() {
        cashier.withdraw(wallet, 200);
    }

    @Then("$200 should be dispensed")
    public void should_be_dispensed_$200() {
        Assertions.assertEquals(200, cashSlot.getContents());

    }

}
