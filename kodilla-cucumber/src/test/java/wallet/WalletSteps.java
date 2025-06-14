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

    @When("I request ${int}")
    public void i_request_amount(int requested) {
        cashier.withdraw(wallet, requested);
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(int dispensed) {
        Assertions.assertEquals(dispensed, cashSlot.getContents());

    }

}
